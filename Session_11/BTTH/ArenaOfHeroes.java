package Session_11.BTTH;

import java.util.ArrayList;
import java.util.List;

public class ArenaOfHeroes {
    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===");

        List<GameCharacter> characters = new ArrayList<>();

        Warrior warrior = new Warrior("Yasuo", 500, 50, 20);
        Mage mage = new Mage("Veigar", 300, 40, 200);

        characters.add(warrior);
        characters.add(mage);

        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("3. [Quái vật] Goblin (Anonymous Class) tấn công!");
                System.out.println("   -> Goblin cắn trộm " + target.getName() + "... Gây 10 sát thương.");
                target.takeDamage(10);
            }

            @Override
            public void displayInfo() {
                System.out.println("Tên: Goblin | HP: " + hp);
            }
        };

        characters.add(goblin);

        System.out.println("Đã khởi tạo " + GameCharacter.getCount() + " nhân vật tham gia đấu trường.\n");

        warrior.attack(goblin);
        mage.useUltimate(warrior);
        goblin.attack(mage);

        System.out.println("\n=== THÔNG SỐ SAU LƯỢT ĐẤU ===");
        for (GameCharacter c : characters) {
            c.displayInfo();
        }
    }
}

