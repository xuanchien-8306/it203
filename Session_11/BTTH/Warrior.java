package Session_11.BTTH;

class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("1. [Chiến binh] " + name + " tấn công " + target.getName() + "!");
        target.takeDamage(attackPower);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " dùng chiêu cuối ĐẤM NGÀN CÂN!");
        int damage = attackPower * 2;
        target.takeDamage(damage);

        int selfDamage = (int) (hp * 0.1);
        hp -= selfDamage;
        System.out.println("   -> " + name + " tự mất " + selfDamage + " HP do gắng sức.");
    }

    @Override
    public void takeDamage(int amount) {
        int realDamage = amount - armor;
        if (realDamage < 0) realDamage = 0;
        super.takeDamage(realDamage);
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}
