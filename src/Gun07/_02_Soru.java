package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //girilen bir ad soyadin adini ve soyadini ayirip ayri ayri yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("adinizi ve soyadinizi giriniz=");
        String tamAd= oku.nextLine();
        int bosluk=tamAd.indexOf(" ");
        String ad=tamAd.substring(0,bosluk);
        String soyAd=tamAd.substring(bosluk+1);
        System.out.println("ad = " + ad);
        System.out.println("soyAd = " + soyAd);
    }
}
