package GajiPegawai;

public class StafKebersihan extends Pegawai {

    private int poin;
    private double  gajiPerpoin;

    public StafKebersihan(String nama, String nip, String alamat, int poin) {
        super(nama, nip, alamat);
        this.poin = poin;
        this.gajiPerpoin = 25000;
    }

    public double getGajiPerpoin() {
        return super.getGajiPokok() + (poin * gajiPerpoin);
    }

    @Override
    double getGajiTotal() {
        return 0;
    }
}
