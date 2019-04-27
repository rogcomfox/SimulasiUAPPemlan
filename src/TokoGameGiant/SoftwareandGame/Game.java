package TokoGameGiant.SoftwareandGame;

public class Game extends Software {
    private String platform, tipe;
    private int tahunrilis;
    private double hargagame;

    public Game(String code, String name, String platform, String tipe, double hargagame, int tahunrilis){
        super(code, name);
        this.platform = platform;
        this.tipe = tipe;
        this.hargagame = hargagame;
        this.tahunrilis = tahunrilis;
    }

    public double getHargagame() {
        return hargagame;
    }

    public double diskon(){
        if (this.tahunrilis >= 2000 && this.tahunrilis <= 2009){
            return hargagame * 0.5;
        }
        if (this.tahunrilis >= 2010 && this.tahunrilis <= 2014){
            return hargagame * 0.25;
        }
        if (this.tahunrilis >= 2015 && this.tahunrilis <= 2016){
            return hargagame * 0.05;
        }else {
            return 0;
        }
    }
    public double cashback(double beli){
        if (beli > 100000){
            return beli * 0.05;
        }else {
            return 0;
        }
    }
    @Override
    public String toString(){
        return String.format("%-12s|%-40s|%-15s|%-15s|%-15d|%-15f", getCode(),getName(), platform  , tipe , tahunrilis , hargagame);
    }
}
