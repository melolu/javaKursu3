package Gun14;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        //girilen 20 sayinin toplaminin sonucunu yazdiriniz
        Scanner scan=new Scanner(System.in);
        int sayac=0;
        int toplam=0;

        while (sayac<20){
            System.out.print("sayi giriniz=");
            int sayi= scan.nextInt();
            toplam=toplam+sayi;
            sayac++;

        }
        System.out.println("toplam="+toplam);
    }
}
