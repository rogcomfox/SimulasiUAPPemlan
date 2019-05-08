package MobileLegend;

public abstract class Hero {
    private int attack;
    private int defense;
    private int hp;
    private int manaregen;
    private int mana;
    private int specialattack;

    public Hero(int attack, int defense, int hp, int manaregen, int mana, int specialattack) {
        this.attack = attack;
        this.defense = defense;
        this.hp = hp;
        this.manaregen = manaregen;
        this.mana = mana;
        this.specialattack = specialattack;
    }

}
