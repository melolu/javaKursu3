package Gun35.Odev;

public class Calisan extends BilgiTipi{
    int maas;

    public Calisan(String isim, String adres, Okul okul, UyeTipi uyeTipi, int maas) {
        super(isim, adres, okul, uyeTipi);
        this.maas = maas;
    }
}
