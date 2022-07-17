package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        //Split: bir stringi parcalara ayirmak demek
        //kullanicidan alacaginiz cumleyi kelimeleirne gore alt alta yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle giriniz=");
        String cumle= scan.nextLine();

        String[] kelimeler=cumle.split(" ");
        System.out.println("kelimeler = " + Arrays.toString(kelimeler));

        System.out.println("kelimeler sayisi = " + kelimeler.length);

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);
        }
    }
}
