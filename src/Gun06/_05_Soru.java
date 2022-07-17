package Gun06;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //girilen bir ad soyadi "Ismet Temur" I.T. seklinde yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz=");
        String isim=oku.nextLine();
        char ilkHarf=isim.charAt(0);
        int boslukIndex=isim.indexOf(" ");
        char soyadIlk=isim.charAt(boslukIndex+1);

        System.out.print("Sifreli isim="+ilkHarf+"."+soyadIlk+".");
    }
}
