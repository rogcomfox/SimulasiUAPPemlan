package Uap;

public class Sales extends Pegawai implements Bonus {

    private int produk;

    public Sales(String nama, String NIP, int tahunmasuk, double gajipokok, int produk) {
        super(nama, NIP, tahunmasuk, gajipokok);
        this.produk = produk;
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

    @Override
    double gajiTotal() {
        if (produk > 10){
            return super.getGajipokok() + bonus() + (0.03 * (produk - 10));
        }
        else {
            return super.getGajipokok() + bonus();
        }
    }

    public void Tampilkan(){
        System.out.println("Nama = " + getNama() );
        System.out.println("Gaji Pokok = " + (getGajipokok() / 1000000) + "jt");
        System.out.println("Gaji Total = "+ (gajiTotal()/ 1000000) + "jt");
    }
}
