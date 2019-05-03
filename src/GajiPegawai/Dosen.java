package GajiPegawai;

public class Dosen extends Pegawai {

    private int jumlahSks;
    private double gajiPerSks;

    public Dosen(String nama, String nip, String alamat, double gajiPokok, int jumlahSks) {
        super(nama, nip, alamat, gajiPokok);
        this.jumlahSks = jumlahSks;
        this.gajiPerSks = 100000;
    }

    @Override
    public double getGajiTotal() {
        return super.getGajiPokok() + gajiPerSks;
    }
}
