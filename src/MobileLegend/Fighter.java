package MobileLegend;

public class Fighter implements Character{
    private final int attack;
    private final double defense;
    private int HP;
    private final int manaregen;
    private int mana;
    private final int specialattack;
    private final int manaused;

    public Fighter() {
        this.attack = 17;
        this.defense = 3;
        this.HP = 92;
        this.manaregen = 21;
        this.mana = 87;
        this.specialattack = 30;
        this.manaused = 55;
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
