package GajiPegawai;

public abstract class Pegawai {
    private String nip, alamat, nama;
    private double  gajiPokok;

    Pegawai(String nama, String nip, String alamat){
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
        this.gajiPokok = 2000000;
    }

    String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNip() {
        return nip;
    }

    double getGajiPokok() {
        return gajiPokok;
    }

    abstract double getGajiTotal();
}
