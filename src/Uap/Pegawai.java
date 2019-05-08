package Uap;

public abstract class Pegawai {
    private String nim, NIP;
    private int tahunmasuk;
    private double gajipokok;

    public Pegawai(String nim, String NIP, int tahunmasuk, double gajipokok) {
        this.nim = nim;
        this.NIP = NIP;
        this.tahunmasuk = tahunmasuk;
        this.gajipokok = gajipokok;
    }

    public String getNim() {
        return nim;
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
