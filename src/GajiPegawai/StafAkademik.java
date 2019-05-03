package GajiPegawai;

public class StafAkademik extends Pegawai implements Sertifikasi {

    private int jumlahHari;
    private double gajiPerHari;
    private boolean certified;

    public StafAkademik(String nama, String nip, String alamat, int jumlahHari) {
        super(nama, nip, alamat);
        this.jumlahHari = jumlahHari;
        this.gajiPerHari = 50000;
    }

    @Override
    double getGajiTotal() {
        return super.getGajiPokok() + (jumlahHari - 20 * gajiPerHari);
    }

    @Override
    public boolean isCertified() {
        return certified;
    }
}
