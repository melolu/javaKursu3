package Gun07;

public class _01_StringSubstring {
    public static void main(String[] args) {
        // stringin belli bir bolumunu alma islemidir.

        String s1="Merhaba arkadaslar";

        String parca1=s1.substring(2,6); //2.indexten basla 6ya kadar al(6dahil degil)
        System.out.println("parca1 = " + parca1);

        System.out.println("arkadas  = " + s1.substring(8, 15));

        System.out.println("arkadaslar = " + s1.substring(8));
        //tek sayi girersen baslangic noktasini belirtmis olursun ve sonuna kadar alir
    }
}
