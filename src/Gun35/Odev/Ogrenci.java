package Gun35.Odev;

public class Ogrenci extends BilgiTipi{
    int ucret;

    public Ogrenci(String isim, String adres, Okul okul, UyeTipi uyeTipi, int ucret) {
        super(isim, adres, okul, uyeTipi);
        this.ucret = ucret;
    }
}
