package GajiPegawai;

public abstract class Pegawai {
    private String nip, alamat, nama;

    public Pegawai(String nama, String nip, String alamat){
        this.nama = nama;
        this.nip = nip;
        this.alamat = alamat;
    }
}
