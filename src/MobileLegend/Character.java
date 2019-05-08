package MobileLegend;

public interface Character {
    int getHp();
    int getMana();
    void attack(Character c);
    void specialAttack(Character c);
    void takeDamage(int damage);
}
