package Gun17;

public class Odev9 {
    public static void main(String[] args) {
        //9- String Array (Dizi) oluşturunuz.
        // elemanları : Apple, Orange , Babana, Kiwi Array'leri tüm elemanları yazdırınız.

        String[] dizi={"Apple","Orange","Banana","Kiwi"};
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i+1)+". eleman = " + dizi[i]);
        }
    }
}
