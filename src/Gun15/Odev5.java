package Gun15;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        //5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        String sayi= scan.next();
        int uzunluk=sayi.length();
        char ilksayi=sayi.charAt(0);
        char sonsayi=sayi.charAt(uzunluk-1);
        if (ilksayi==sonsayi){
            System.out.println("girilen sayinin ilk ve son basamagi esittir");

        }
        else System.out.println("girilen sayinin ilk ve son basamagi esit degildir");

    }
}
