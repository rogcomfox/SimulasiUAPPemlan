package Uap;

public class Programmer extends Pegawai implements Bonus{

    private int lembur;

    public Programmer(String nama, String NIP, int tahunmasuk, double gajipokok, int lembur) {
        super(nama, NIP, tahunmasuk, gajipokok);
        this.lembur = lembur;
    }

    @Override
    public double bonus() {
        if (2019 - super.getTahunmasuk() >=5 ){
            return super.getGajipokok() * super.getTahunmasuk() * (10/100);
        }
        else if(2019 - super.getTahunmasuk() >= 1){
            return super.getGajipokok() * super.getTahunmasuk() * (5/100);
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

    public void Tampilkan(){
        System.out.println("Nama = " + getNama() );
        System.out.println("Gaji Pokok = " + (getGajipokok() / 1000000) + "jt");
        System.out.println("Gaji Total = "+ (gajiTotal()/ 1000000) + "jt");
        System.out.println("Bonus dan Tunjangan Via PoPay = "+ BonusLembur());
    }
}
