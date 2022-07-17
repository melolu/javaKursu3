package Gun14;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuzç
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();
        int sayac=1;
        double carpim=1; //buyuk sayilar girildiginde veri sonucunu alabilmek icin double atamasi yapildi

        while (sayac<=sayi){
            carpim=carpim*sayac;
            sayac++;
        }
        System.out.println("carpim = " + carpim);
    }
}
