package Session_11.BTTH;

abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;
    protected static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp <= 0) {
            hp = 0;
            System.out.println("   -> " + name + " đã bị hạ gục!");
        } else {
            System.out.println("   -> " + name + " mất " + amount + " máu. HP còn: " + hp + ".");
        }
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp);
    }

    public static int getCount() {
        return count;
    }
}
