package GajiPegawai;

public class Dosen extends Pegawai implements Sertifikasi{

    private int jumlahSks;
    private double gajiPerSks;
    private boolean certified;

    public Dosen(String nama, String nip, String alamat, double gajiPokok, int jumlahSks, boolean certified) {
        super(nama, nip, alamat);
        this.jumlahSks = jumlahSks;
        this.certified = certified;
        this.gajiPerSks = 100000;
    }

    @Override
    public double getGajiTotal() {
        return super.getGajiPokok() + (jumlahSks * gajiPerSks);
    }

    @Override
    public boolean isCertified() {
        return certified;
    }
}
