package GajiPegawai;

import java.util.ArrayList;

public class DataPegawai {

    ArrayList<Pegawai> pegawaiList;

    public DataPegawai() {
        this.pegawaiList = new ArrayList<>();
    }

    public void addPegawai(Pegawai pegawai){
        pegawaiList.add(pegawai);
    }

    public void tampikan(){
        for (Pegawai p: pegawaiList){
            System.out.println(p.getNama() + " " + p.getGajiTotal());
        }
    }
}
