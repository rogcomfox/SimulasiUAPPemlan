package DuniaFantasi.Assets;

public class Elf implements UniqueSkill{
    private double healthpoin;
    private double manapoin;
    private double attackpoin;
    private double defensepoin;
    private double magicattack;
    private String name, clan;

    public Elf(String name, String clan, double healthpoin, double manapoin, double attackpoin, double defensepoin, double magicattack){
        this.name = name;
        this.clan = clan;
        this.healthpoin = healthpoin;
        this.manapoin = manapoin;
        this.attackpoin = attackpoin;
        this.defensepoin = defensepoin;
        this.magicattack = magicattack;
    }

    public String getName() {
        return name;
    }

    public String getClan() {
        return clan;
    }

    public double getAttackpoin() {
        return attackpoin;
    }

    public double getHealthpoin() {
        return healthpoin;
    }

    public double getManapoin() {
        return manapoin;
    }

    public double getDefensepoin() {
        return defensepoin;
    }

    public double getMagicattack() {
        return magicattack;
    }

    @Override
    public double magicattackadd() {
        magicattack++;
        return magicattack;
    }

    @Override
    public double healthadd() {
        return 0;
    }

    @Override
    public double manaadd() {
        manapoin++;
        return manapoin;
    }

    @Override
    public double defenseadd() {
        return 0;
    }

    @Override
    public String identitiy() {
        return "Hunter";
    }
    public String toString(){
        return String.format("Nama: %s\nClan: %s\nHealthPoin: %.2f\nAttackPoin: %.2f\nManaPoin: %.2f\nDefensePoin: %.2f\nMagicAttack: %.2f", getName(), getClan(), getHealthpoin(), getAttackpoin(), getManapoin(), getDefensepoin(), getMagicattack());
    }
}
