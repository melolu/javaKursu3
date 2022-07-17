package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        //Kullanicinin adini ve soyadini alarak ekrana yazdiriniz

        Scanner oku=new Scanner(System.in);

        /* System.out.print("Lutfen adinizi giriniz: ");

        String ad=oku.next();

        System.out.print("Lutfen soyadinizi giriniz: ");

        String soyad=oku.next();

        System.out.println("Adiniz ve soyadiniz:"+ad+" "+soyad); */

        System.out.print("Adinizi ve soyadinizi giriniz:");
        String adSoyad=oku.nextLine();
        System.out.println("adSoyad = " + adSoyad);
    }
}
