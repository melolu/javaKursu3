package Gun15;

import java.util.Scanner;

public class Odev6 {
    public static void main(String[] args) {
        //6-Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();

        int tersi=0;

        while (sayi>0){

            int basamak=sayi%10;

            tersi=tersi*10+basamak;

            sayi=sayi/10;
        }
        System.out.println("tersi = " + tersi);
    }
}
