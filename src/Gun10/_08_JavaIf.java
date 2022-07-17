package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayinin birler ve onlar basamaginin esit olup olmadigini yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();

        if ((sayi/10)%10==sayi%10){
            System.out.print("sayinin birler ve onlar basamagi birbirine esittir");
        }
        if ((sayi/10)%10 != sayi%10){
            System.out.print("sayinin birler ve onlar basamagi birbirine esit degildir");
        }
    }
}
