package Gun31.StaticModifier.Ornek1;

public class Okul {
    public static void main(String[] args) {

        Ogrenci ogr1=new Ogrenci("Anil","Aydin");
        Ogrenci ogr2=new Ogrenci("Sebnem","Metin");
        Ogrenci ogr3=new Ogrenci("Melih","Senem");
        //...
        //...
        //...
        Ogrenci ogr499=new Ogrenci("Ayse","Temur");
        Ogrenci ogr500=new Ogrenci("Ahmet","Johnson");

        System.out.println("ogr499 = " + ogr499); //ogr499 = Ogrenci{ad='Ayse', soyad='Temur', OkulAd='OMU'}
        System.out.println("ogr500 = " + ogr500); //ogr500 = Ogrenci{ad='Ahmet', soyad='Johnson', OkulAd='OMU'}

    }
}
