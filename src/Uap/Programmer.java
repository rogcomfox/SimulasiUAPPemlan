package Uap;

public class Programmer extends Pegawai implements Bonus{

    private int lembur;

    public Programmer(String nim, String NIP, int tahunmasuk, double gajipokok, int lembur) {
        super(nim, NIP, tahunmasuk, gajipokok);
        this.lembur = lembur;
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

    public double BonusLembur(){
        return super.getGajipokok() * lembur * 0.5;
    }

    @Override
    double gajiTotal() {
        return super.getGajipokok() + bonus();
    }
}
