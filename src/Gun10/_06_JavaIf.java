package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        //girilen 3 sayidan en buyuk olani bulunuz
        Scanner scan = new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz=");
        int sayi1 = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz=");
        int sayi2 = scan.nextInt();
        System.out.print("ucuncu sayiyi giriniz=");
        int sayi3 = scan.nextInt();

        if (sayi1 > sayi2) {
            if (sayi1 > sayi3) {
                System.out.println("en buyuk sayi sayi1=" + sayi1);
            }
        }
        if (sayi2 > sayi1) {
            if (sayi2 > sayi3) {
                System.out.println("en buyuk sayi sayi2=" + sayi2);
            }
        }
        if (sayi3 > sayi1) {
            if (sayi3 > sayi2) {
                System.out.println("en buyuk sayi sayi3=" + sayi3);
            }
        }
    }
}
