package CafeUbKedai;

public class AssetCafe {
    private int nomeja, jumlah;
    private double harga;
    private String pesanan;

    public AssetCafe(int nomeja, String pesanan, int jumlah, double harga){
        this.nomeja = nomeja;
        this.pesanan = pesanan;
        this.jumlah = jumlah;
        this.harga = harga;
    }
}
