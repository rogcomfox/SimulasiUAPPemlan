package MobileLegend;

public class Tank implements Character{
    private final int attack;
    private final double defense;
    private int HP;
    private final int manaregen;
    private int mana;
    private int specialactive;
    private final int manaused;

    public Tank() {
        this.attack = 11;
        this.defense = 4.8;
        this.HP = 100;
        this.manaregen = 16;
        this.mana = 75;
        this.specialactive = 0;
        this.manaused = 81;
    }

    @Override
    public int getHp() {
        return HP;
    }

    @Override
    public int getMana() {
        return mana;
    }

    @Override
    public void attack(Character c) {
        c.takeDamage(attack);
        mana += manaregen;
    }

    @Override
    public void specialAttack(Character c) {
        if (mana < manaused){
            c.takeDamage(attack);
        }else{
            mana -= manaused;
            c.takeDamage(specialactive);
        }
    }
    @Override
    public void takeDamage(int damage) {
        HP -= damage - defense;
    }
}
