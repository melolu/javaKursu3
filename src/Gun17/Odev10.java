package Gun17;

public class Odev10 {
    public static void main(String[] args) {
        //10- String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
        //Array'daki eleman sayısını yazdırınız.
        //Cevap 4 olmalı.

        String[] dizi={"new jersey","new york","boston","California"};
        int sayac=0;
        for (int i = 0; i < dizi.length; i++) {
            sayac++;
        }
        System.out.println("eleman sayisi = " + sayac);

        //veya

        System.out.println("Eleman Sayisi = " + (dizi.length));
    }
}
