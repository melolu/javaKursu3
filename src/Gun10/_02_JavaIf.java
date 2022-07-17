package Gun10;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayinin negatif mi pozitif mi oldugunu yazdiriniz
        //sifir ise sifir yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi = scan.nextInt();
        if (sayi > 0) {
            System.out.print("sayi pozitiftir");
        }
        if (sayi < 0) {
            System.out.print("sayi negatiftir");
        }
        if (sayi == 0) {
            System.out.print("sayi sifira esittir");
        }
    }
}
