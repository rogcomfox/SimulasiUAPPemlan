package Uap;

import java.math.BigDecimal;

public class Manager extends Pegawai implements Bonus {

    private double tunjangan;

    public Manager(String nama, String NIP, int tahunmasuk, double gajipokok) {
        super(nama, NIP, tahunmasuk, gajipokok);
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
        if (2019 - super.getTahunmasuk() >= 5){
            return super.getGajipokok() * super.getTahunmasuk() * 0.1;
        }
        else if(2019 - super.getTahunmasuk() >= 1){
            return super.getGajipokok() * super.getTahunmasuk() * 0.05;
        }
        else {
            return 0;
        }
    }
    public void Tampilkan(){
        System.out.println("Nama = " + getNama() );
        System.out.println("Gaji Pokok = " + (getGajipokok() / 1000000) + "jt");
        System.out.println("Gaji Total = "+ (gajiTotal()/ 1000000) + "jt");
        System.out.println("Bonus & Tunjangan via GoPay = " + getTunjangan());
    }
}
