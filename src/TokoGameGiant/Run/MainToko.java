package TokoGameGiant.Run;

import TokoGameGiant.SoftwareandGame.Game;

public class MainToko {
    public static void main(String[] args) {
        int totalA = 0, totalB = 0, totalC = 0;
        double cashA = 0, cashB = 0, cashC = 0;
        Game[] a = new Game[3];
        Game[] b = new Game[4];
        Game[] c = new Game[5];
        a[0] = new Game("R001", "Persona 5", "Console", "Role-Playing", 500000, 2018);
        a[1] = new Game("M003", "Last Window: The Secret of Cape Wes", "Handheld", "Mystery", 65000, 2010);
        a[2] = new Game("H002", "Spirit Camera: The Cursed Memoir", "Handheld", "Horror", 110000, 2013);
        b[0] = new Game("A001", "Far Cry V", "Console", "Adventure", 175000, 2011);
        b[1] = new Game("F002", "The Witcher 3: Wild Hunt", "Console", "Fantasy", 350000, 2015);
        b[2] = new Game("M002", "Detective Pikachu", "Handheld", "Mystery", 130000, 2018);
        b[3] = new Game("R002", "Mass Effect", "Console", "Role-Playing", 50000, 2007);
        c[0] = new Game("A003", "Uncharted: Drake's Fortune", "Console", "Role-Playing", 90000, 2009);
        c[1] = new Game("F001", "Final Fantasy XIII", "Console", "Fantasy", 250000, 2009);
        c[2] = new Game("R003", "Fallout 4", "Console", "Role-Playing", 200000, 2015);
        c[3] = new Game("M001", "L.A. Noire", "Console", "Mystery", 105000, 2011);
        c[4] = new Game("H003", "The 3rd Birthday", "Handheld", "Horror", 95000, 2011);
        System.out.printf("%-3s|%-12s|%-40s|%-15s|%-15s|%-15s|%-10s\n", "No", "Kode Game", "Nama", "Platform","Tipe", "Tahun Rilis", "Harga");
        int i=1;
        for (Game pelA : a) {
            System.out.println(i+ "  |"+ pelA);
            totalA += pelA.getHargagame() - pelA.diskon();
            cashA = pelA.cashback(totalA);
            i++;
        }
        System.out.println("Pelanggan A mendapatkan cashback sebesar \t: Rp "+cashA);
        System.out.println("Total yang harus dibayar Pelanggan A \t\t: Rp " + totalA);
        System.out.println();
        System.out.printf("%-3s|%-12s|%-40s|%-15s|%-15s|%-15s|%-10s\n", "No", "Kode Game", "Nama", "Platform","Tipe", "Tahun Rilis", "Harga");
        i=1;
        for (Game pelB : b) {
            System.out.println(i+ "  |"+ pelB);
            totalB += pelB.getHargagame() - pelB.diskon();
            cashB = pelB.cashback(totalB);
            i++;
        }
        System.out.println("Pelanggan B mendapatkan cashback sebesar \t: Rp "+cashB);
        System.out.println("Total yang harus dibayar Pelanggan B \t\t: Rp " + totalB);
        System.out.println();
        System.out.printf("%-3s|%-12s|%-40s|%-15s|%-15s|%-15s|%-10s\n", "No", "Kode Game", "Nama", "Platform","Tipe", "Tahun Rilis", "Harga");
        i=1;
        for (Game pelC : c) {
            System.out.println(i+ "  |"+ pelC);
            totalC += pelC.getHargagame() - pelC.diskon();
            cashC = pelC.cashback(totalC);
            i++;
        }
        System.out.println("Pelanggan C mendapatkan cashback sebesar \t: Rp "+cashC);
        System.out.println("Total yang harus dibayar Pelanggan C \t\t: Rp " + totalC);
        System.out.println();
    }
}
