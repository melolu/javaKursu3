package Gun35._03_Ornek;

public class LiseOgrencisi extends Ogrenci{
    private String bolum;

    public LiseOgrencisi(String isim, String bolum, Sinif sinif) {
        super(isim,sinif);
        setBolum(bolum);

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "LiseOgrencisi{" +
                "bolum='" + bolum + '\'' +
                "} " + super.toString();
    }
}
