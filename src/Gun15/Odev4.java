package Gun15;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        //4- Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= scan.nextInt();
        int basamak=0;
        do {
            sayi=(sayi/10);
            basamak++;
        }while (sayi>0);
        System.out.println("basamak sayisi="+basamak);

        }
    }
