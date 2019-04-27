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

    @Override
    public double magicattackadd() {
        magicattack++;
        return magicattack;
    }

    @Override
    public double healthadd() {
        return healthpoin;
    }

    @Override
    public double manaadd() {
        manapoin++;
        return manapoin;
    }

    @Override
    public double defenseadd() {
        return defensepoin;
    }

    @Override
    public String identitiy() {
        return "Hunter";
    }
    public String toString(){
        return String.format("Nama: %s\nClan: %s\nAttackPoin: %f\nDefensePoin: %f\nMagicAttack: %f");
    }
}
