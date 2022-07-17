package Gun26._04_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        //Ogretmen icin not defteri programi yapilmak isteniyor.
        //Her ogrencinin okulNo(int), tamAdi(String) ve notu(int) vardir
        //Ogretmenden 20 ogrenci icin bu bilgileri aliniz
        //Butun sinifi bir metodda yazdiriniz
        //Sinifin not ortalamasini yine bir metodda yazdiriniz
        Scanner sc=new Scanner(System.in);
        Scanner scint=new Scanner(System.in);
        ArrayList<Ogrenci> ogrListe=new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Ogrenci ogr=new Ogrenci();
            System.out.print("Ogrenci adi ve soyadini giriniz=");
            ogr.tamAdi=sc.nextLine();
            System.out.print("Ogrenci okul no giriniz=");
            ogr.okulNo= scint.nextInt();
            System.out.print("Ogrenci notunu giriniz=");
            ogr.notu= scint.nextInt();

            ogrListe.add(ogr);
        }

        sinifYazdirma(ogrListe);
        ortalama(ogrListe);
    }
    public static void ortalama(ArrayList<Ogrenci> ogrListe){
        int toplam=0;
        for (int i = 0; i < ogrListe.size(); i++) {
            toplam+=ogrListe.get(i).notu;
        }
        System.out.println("ortalama = " + toplam / ogrListe.size());
    }
public static void sinifYazdirma(ArrayList<Ogrenci> list){

    for (Ogrenci a: list){
        System.out.println("Ogrenci Bilgileri = " + a.tamAdi+", no:" + a.okulNo+", notu=" + a.notu);
    }

}
}
class Ogrenci{
    String tamAdi;
    int okulNo;
    int notu;
}
