package Gun31.StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String OkulAd="OMU";
    //hepsi icin gecerli tek tanimlama

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", OkulAd='" + OkulAd + '\'' +
                '}';
    }
}
