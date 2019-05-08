package Uap;

public class Sales extends Pegawai implements Bonus {

    private double tunjangan;
    private int produk;

    public Sales(String nim, String NIP, int tahunmasuk, double gajipokok, int produk) {
        super(nim, NIP, tahunmasuk, gajipokok);
        this.produk = produk;
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

    @Override
    double gajiTotal() {
        if (produk > 10){
            return super.getGajipokok() + bonus() + (0.03 * (produk - 10));
        }
        else {
            return super.getGajipokok() + bonus();
        }
    }
}
