package Gun17;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 5 elemanli int bir dizi tanimlayiniz. Kullanicidan degerleri alarak bu diziyi doldurunuz
        // daha sonra ortalamadan buyuk eleman sayisini bulunuz
        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[5];
        int toplam=0;
        int sayac=0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print((i+1)+". sayiyi giriniz=");
            dizi[i]= scan.nextInt();

            toplam+= dizi[i];
        }
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > toplam / dizi.length) {
                System.out.println("dizi = " + dizi[i]);
                sayac++;
            }
        }
        System.out.println("ortalama = " + (toplam/ dizi.length));
        System.out.println("ortalamadan buyuk eleman sayisi = " + sayac);
    }
}
