package Gun15;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //girilen 1 sayinin, 2 ayni sayinin carpimina esit olup olmadigini bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= scan.nextInt();
        int sayac=1;
        int arananSayi=0;
        while (sayac<=sayi){
            if (sayac*sayac==sayi) {
                arananSayi=sayac;
                break;
            }
            sayac++;
        }
        if (arananSayi>0)
            System.out.println("tam karedir, sayi="+arananSayi);
        else
            System.out.println("bu sayi tam kare degildir");
    }
}
