package CafeUbKedai;

public class AssetCafe {
    private int nomeja, jumlah;
    private double harga;
    private String pesanan;

    public AssetCafe(){

    }

    public AssetCafe(int nomeja, String pesanan, int jumlah, double harga){
        this.nomeja = nomeja;
        this.pesanan = pesanan;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public int getNomeja() {
        return nomeja;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void cetakStatistik(){
        String judul;
    }
    public String toString(){
        return String.format("%10d %15s %8d %10.0f\n", getNomeja(), getPesanan(), getJumlah(), getHarga());
    }
}
