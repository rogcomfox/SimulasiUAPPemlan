package Uap;

public class MainPerusahaan {
    public static void main(String[] args) {
        Manager m1 = new Manager("Yusuf", "5090", 2019, 12000000);
        Manager m2 = new Manager("Joe", "5091", 2016, 15000000);
        Manager m3 = new Manager("Rick", "5092", 2012, 19000000);
        Sales s1 = new Sales("Budi", "6090", 2013, 7000000, 11);
        Programmer p1 = new Programmer("Doni", "7090", 2018, 10000000, 4);


        m1.Tampilkan();
        m2.Tampilkan();
        m3.Tampilkan();
        s1.Tampilkan();
        p1.Tampilkan();
    }
}
