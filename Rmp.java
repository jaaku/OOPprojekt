import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rmp {
    public static void main(String[] args) {
        System.out.println("Tere");
        List<Konto> kontoplaan = new ArrayList<>();
        Konto pank = new Konto("Pank", 1002,'D',2000);
        Konto kassa = new Konto("Kassa", 1001,'D', 100);
        Konto omakapital = new Konto("Omakapital", 1001,'K', 2500);
        kontoplaan.add(pank);
        kontoplaan.add(kassa);
        kontoplaan.add(omakapital);
        System.out.println(kontoplaan);

        java.io.File fail = new java.io.File("2017kvv.csv");

        Kanne kanne1 =new Kanne("01.07.2017","Zone", "arve 123", 6.60, pank, 6, kassa);
        Kanne kanne2 =new Kanne("01.08.2017","Zone", "arve 123", 6.60, pank, 6, kassa);
        ArrayList<Kanne> kanded = new ArrayList<>();
        kanded.add(kanne1);
        kanded.add(kanne2);
        System.out.println("tere" +kanded);


    }
}
