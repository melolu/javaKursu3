package Gun10;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //girilen iki sayidan buyuk olanin degerini ekrana yazdiriniz
        //esit ise esit yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz=");
        int sayi1 = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz=");
        int sayi2 = scan.nextInt();

        if (sayi1 > sayi2) {
            System.out.print("buyuk sayi=" + sayi1);
        }
        if (sayi2 > sayi1) {
            System.out.print("buyuk sayi=" + sayi2);
        }
        if (sayi1 == sayi2) {
            System.out.println("sayilar birbirine esittir");
        }
    }
}
