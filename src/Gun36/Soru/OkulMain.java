package Gun36.Soru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci("melih","aydin","ogrenci","11A");
        Calisan cal=new Calisan("sebnem","metin","calismak","test");

        System.out.println("ogr = " + ogr);
        System.out.println("cal = " + cal);

        Kisi.KimlikBelgesiYaz(ogr);
        Kisi.KimlikBelgesiYaz(cal);
    }
}
