package Gun13;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        //girilen 2 tam sayiyi kullanicidan aldiktan sonra toplamaicin T, cikarma icin C, carpma icin P, bolme icin B
        //harflerini alarak istege uygun olan islemi yaptirip sonucu yazdiriniz
        Scanner read = new Scanner(System.in);
        System.out.print("1. tam sayiyi giriniz=");
        int sayi1 = read.nextInt();
        System.out.print("2. tam sayiyi giriniz=");
        int sayi2 = read.nextInt();

        System.out.println("--->hangi islemi yaptirmak istiyorsunuz?\nToplama= T\nCikarma= C\nCarpma= P\nBolme= B ");
        Scanner matIslem=new Scanner(System.in);
        String islem = matIslem.next();

        if (islem.equalsIgnoreCase("T"))
            System.out.println("toplama islemi sonucu=" + (sayi1 + sayi2));

        else if (islem.equalsIgnoreCase("C"))
            System.out.println("Cikarma islemi sonucu=" + (sayi1 - sayi2));

        else if (islem.equalsIgnoreCase("P"))
            System.out.println("Carpma islemi sonucu=" + (sayi1 * sayi2));

        else if (islem.equalsIgnoreCase("B"))
            System.out.println("Bolme islemi sonucu=" + (sayi1 / sayi2));


    }
}
