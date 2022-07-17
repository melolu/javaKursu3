package Gun17;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {
        //kullanicidan alacaginiz 7 sayiyi aldiktan sonra kac tanesinin ortalamadan buyuk ve tek sayi oldugunu bulunuz
        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[7];
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+". sayiyi giriniz=");
            dizi[i]= scan.nextInt();
            toplam+=dizi[i];

        }
        int sayac=0;
        for (int i = 0; i < dizi.length; i++) {
            if ( dizi[i] > toplam / dizi.length && dizi[i]%2==1){
                sayac++;

            }

        }
        System.out.println("ortalama = " + toplam / dizi.length);
        System.out.println("sayac = " + sayac);
    }
}
