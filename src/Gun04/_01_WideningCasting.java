package Gun04;

public class _01_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double ;otomatik donusum

        int sayi=9;
        long toplam= 678;
        double oran=3.2;

        oran=sayi; //oran=9 kayip yok, bu tip donusume genisletilme yonunde
                    // oldugundan Widening casting denir.
                    //diger adiyla herhangi bir ek islem yapilmadigindan otomatik donusum denir.
        System.out.println("oran = " + oran);

        toplam=sayi;
        System.out.println("toplam = " + toplam);
    }
}
