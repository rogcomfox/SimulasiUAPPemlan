package GajiPegawai;

public abstract class Pegawai {
    private String nip, alamat, nama;
    private double  gajiPokok;

    public Pegawai(String nama, String nip, String alamat, double gajiPokok){
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNip() {
        return nip;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    abstract double getGajiTotal();
}
