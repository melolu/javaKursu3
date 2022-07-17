package Gun10;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //girilen 1 sayinin onlar basamaginin tek olup olmadigini yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();
        int onlar=(sayi/10)%10;
        if (onlar%2==1){
            System.out.println("sayinin onlar basamagi tektir ");
        }
        if (onlar%2==0){
            System.out.println("sayinin onlar basamagi tek degildir ");
        }
        //girilen bir sifrenin "Bayrak"kelimesine esit olup olmadigini yazdiriniz
        String gizliSifre="Bayrak";
        System.out.print("bir sifre giriniz=");
        String sifre= scan.next();
        boolean ayniMi=gizliSifre.equals(sifre);
        if (ayniMi){
            System.out.println("esittir");
        }
        if (!ayniMi){
            System.out.println("esit degildir");
        }

        //girilen bir kelimenin ilk ve son harfinin ayni olup olmadigini yazdiriniz
        System.out.print("bir kelime giriniz=");
        String kelime= scan.next();
        char ilkHarf=kelime.charAt(0);
        char sonHarf=kelime.charAt(kelime.length()-1);

        if (ilkHarf==sonHarf){
            System.out.println("ilk ve son aynidir");
        }
        if (ilkHarf!=sonHarf){
            System.out.println("ilk ve son harf ayni degildir");
        }

        //girilen bir kelimede A harfi olup olmadgini yaziniz
        System.out.print("bir kelime giriniz=");
        String kelime2= scan.next();
        boolean varmi=kelime2.contains("A");
        if (varmi){
            System.out.println("kelimede A harfi var");
        }
        if (!varmi){
            System.out.println("kelimede A harfi yok");
        }

        //girilen 2 kelimenin ayni uzunlukta olup olmadigini yazdiriniz
        System.out.print("ilk kelimeyi giriniz=");
        String birinciKelime=scan.next();
        System.out.print("ikinci kelimeyi giriniz=");
        String ikinciKelime=scan.next();

        if (birinciKelime.length()==ikinciKelime.length()){
            System.out.println("girilen iki kelimenin uzunlugu esittir");
        }
        if (birinciKelime.length() != ikinciKelime.length()){
            System.out.println("girilen iki kelimenin uzunlugu esit degildir");
        }


        //kullanicinin bir yeni sifre girmesini isteyiniz. sifrenin uzunlugu 8den kucuk ise sifreniz kabul edilmedi yazsin
        System.out.print("yeni bir sifre giriniz=");
        String sifre2= scan.next();
        if (sifre2.length()<8){
            System.out.println("sifreniz kabul edilmedi");
        }

    }
}
