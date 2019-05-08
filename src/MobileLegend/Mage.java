package MobileLegend;

public class Mage implements Character{
    private final int attack;
    private final double defense;
    private int HP;
    private final int manaregen;
    private int mana;
    private final int specialattack;
    private final int manaused;

    public Mage() {
        this.attack = 15;
        this.defense = 2.5;
        this.HP = 80;
        this.manaregen = 24;
        this.mana = 93;
        this.specialattack = 51;
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
            c.takeDamage(specialattack);
        }
    }
    @Override
    public void takeDamage(int damage) {
        HP -= damage - defense;
    }
}
