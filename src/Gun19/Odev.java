package Gun19;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //1- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız.
        // Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.
        Scanner scan=new Scanner(System.in);
        int[] dizi=new int[4];
        int enb=Integer.MIN_VALUE;
        int enk=Integer.MAX_VALUE;
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("4 tane sayi giriniz=");
            dizi[i]= scan.nextInt();

            if (dizi[i]>enb)
                enb=dizi[i];

            if (dizi[i]<enk)
                enk=dizi[i];
        }
        System.out.println("en buyuk - en kucuk = " + (enb-enk));

    }
}
