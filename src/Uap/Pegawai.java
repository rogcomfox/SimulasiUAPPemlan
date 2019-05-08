package Uap;

public abstract class Pegawai {
    private String nama, NIP;
    private int tahunmasuk;
    private double gajipokok;

    public Pegawai(String nama, String NIP, int tahunmasuk, double gajipokok) {
        this.nama = nama;
        this.NIP = NIP;
        this.tahunmasuk = tahunmasuk;
        this.gajipokok = gajipokok;
    }

    public String getNama() {
        return nama;
    }

    public String getNIP() {
        return NIP;
    }

    public int getTahunmasuk() {
        return tahunmasuk;
    }

    public double getGajipokok() {
        return gajipokok;
    }
    abstract double gajiTotal();

}
