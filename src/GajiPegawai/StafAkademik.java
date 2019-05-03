package GajiPegawai;

public class StafAkademik extends Pegawai implements Sertifikasi {

    private int jumlahHari;
    private double gajiPerHari;
    private boolean certified;

    StafAkademik(String nama, String nip, String alamat, int jumlahHari, boolean certified) {
        super(nama, nip, alamat);
        this.jumlahHari = jumlahHari;
        this.certified = certified;
        this.gajiPerHari = 50000;
    }

    double getGajiTotal() {
        return super.getGajiPokok() + ((jumlahHari - 20) * gajiPerHari);
    }

    @Override
    public boolean isCertified() {
        return certified;
    }
}
