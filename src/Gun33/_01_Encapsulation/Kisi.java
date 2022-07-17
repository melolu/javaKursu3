package Gun33._01_Encapsulation;

public class Kisi {
    String ad;
    String soyad;
    private int yas;

    //degiskene direk erisimi kapatip bir metod ile korumali veri
    //gonderme ve alma islemine Encapsulation denir

    public Kisi() {
    }

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
       // this.yas = yas;
        yasAta(yas);
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }

    public void yasAta(int yas){
        this.yas=Math.abs(yas);
    }
    public int yasGetir(){
        return this.yas;
    }
}
