package Gun09;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //kullanicinin girecegi iki sayinin birbirine esit olup olmadigini yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen ilk sayiyi giriniz: ");
        int sayi1= scan.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        int sayi2=scan.nextInt();
        System.out.println("iki sayi birbirine esit mi? = " + (sayi1==sayi2));
    }
}
