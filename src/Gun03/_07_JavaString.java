package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        int sayi=5;

        String ad="Melih"; //string ifadelerin sayi gibi bir siniri olmadigindan tirnak ile siniri belli edilir.
        String soyad="Aydin";

        System.out.println(ad+soyad); //ciktisi MelihAydin
        System.out.println(ad+" "+soyad); //ciktisi Melih Aydin

        String tamAd= ad+soyad;
        String tamAd2= ad+" "+soyad;

        System.out.println(tamAd); //ciktisi MelihAydin
        System.out.println(tamAd2); //ciktisi Melih Aydin

        int yas=25;
        int kilo=80;

        System.out.println(tamAd2+" "+yas+" "+kilo);
    }
}
