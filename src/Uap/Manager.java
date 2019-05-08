package Uap;

public class Manager extends Pegawai implements Bonus {

    private double tunjangan;

    public Manager(String nim, String NIP, int tahunmasuk, int masakerja, double gajipokok) {
        super(nim, NIP, tahunmasuk, gajipokok);
        this.tunjangan = 0.1 * gajiTotal();
    }

    @Override
    double gajiTotal() {
        return super.getGajipokok() +  bonus();
    }

    public double getTunjangan() {
        return tunjangan;
    }

    @Override
    public double bonus() {
        if (super.getTahunmasuk() >= 5){
            return super.getGajipokok() * super.getTahunmasuk() * 0.1;
        }
        else if(super.getTahunmasuk() >= 1){
            return super.getGajipokok() * super.getTahunmasuk() * 0.05;
        }
        else {
            return 0;
        }
    }
}
