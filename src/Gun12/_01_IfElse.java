package Gun12;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //yan yana aralarinda bir boslukla girilen 2 int sayinin birbirine esit olup olmadigini bulun
        Scanner scan=new Scanner(System.in);
        System.out.print("iki sayi giriniz=");
        String girilenSayi=scan.nextLine();
        String StrSayi1=girilenSayi.substring(0,girilenSayi.indexOf(" "));
        String StrSayi2=girilenSayi.substring(girilenSayi.lastIndexOf(" ")+1);

        int sayi1= Integer.parseInt(StrSayi1);
        int sayi2=Integer.parseInt(StrSayi2);

        if (sayi1==sayi2){
            System.out.println("sayilar birbirine esit");
        }
        else {
            System.out.println("sayilar esit degil");
        }
    }
}
