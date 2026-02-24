package Session_11.BTTH;

class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Pháp sư] " + name + " tấn công " + target.getName() + "!");
        if (mana >= 5) {
            mana -= 5;
            target.takeDamage(attackPower);
        } else {
            System.out.println("   -> Hết mana! Đánh thường (giảm sát thương)");
            target.takeDamage(attackPower / 2);
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("2. [Pháp sư] " + name + " dùng chiêu cuối lên " + target.getName() + "!");
        if (mana >= 50) {
            mana -= 50;
            int damage = attackPower * 3;
            System.out.println("   -> " + name + " tốn 50 mana.");
            target.takeDamage(damage);
        } else {
            System.out.println("   -> Không đủ mana để dùng chiêu cuối!");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}