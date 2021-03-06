package GajiPegawai;

public class MainRun {
    public static void main(String[] args) {
        Pegawai d1 = new Dosen("Joe", "1877897875655", "Jl. Veteran 2", 10, true);
        Pegawai d2 = new Dosen("Rick", "1877809099787", "Jl. Veteran 1", 16, false);
        Pegawai sa1 = new StafAkademik("Budi", "1878778", "Malang", 20, true);
        Pegawai sk1 = new StafKebersihan("Rudi", "19248237832758", "Batu", 0);

        DataPegawai dataPegawai = new DataPegawai();
        dataPegawai.addPegawai(d1);
        dataPegawai.addPegawai(d2);
        dataPegawai.addPegawai(sa1);
        dataPegawai.addPegawai(sk1);

        System.out.println("Nomer 1");
        dataPegawai.tampikan();

        System.out.println("Nomer 2");
        for (Pegawai p: dataPegawai.pegawaiList){
            if (p instanceof Sertifikasi){
                System.out.println(p.getNama());
            }
        }
        System.out.println("Nomer 3");
        double totalGajiSertifikasi = 0;
        for (Pegawai p: dataPegawai.pegawaiList){
            if (p instanceof Sertifikasi){
                if (((Sertifikasi) p).isCertified()){
                    System.out.println(p.getNama());
                    totalGajiSertifikasi += 2000000;
                }
            }
        }
    }
}
