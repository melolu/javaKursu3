package Gun26._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Ogrenci ogr = new Ogrenci();
            System.out.println("Ogrenci adi=");
            ogr.ad = sc.nextLine();

            System.out.println("Ogrenci soyadi=");
            ogr.soyad = sc.nextLine();

            System.out.println("Ogrenci sinifi=");
            ogr.sinif = scint.nextInt();

            System.out.println("Ogrenci adresi=");
            ogr.adres = sc.nextLine();

            snf.add(ogr);
        }

        for (Ogrenci ogr : snf) {
            System.out.println("ogr.ad = " + ogr.ad);
            System.out.println("ogr.soyad = " + ogr.soyad);
            System.out.println("ogr.sinif = " + ogr.sinif);
            System.out.println("ogr.adres = " + ogr.adres);
        }
    }
}
