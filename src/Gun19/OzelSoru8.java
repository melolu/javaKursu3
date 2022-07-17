package Gun19;

import java.util.Scanner;

public class OzelSoru8 {
    //8- Girilen bir sayıya kadar olan çift sayıları (0 ve girilen sayı dahil) yazdırınız.
    //Example 1:
    //int input = 10;
    //print 0 2 4 6 8 10 olmalı
    //Example 2:
    //int input = 15;
    //print 0 2 4 6 8 10 12 14 olmalı
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= sc.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (i%2==0)
                System.out.print(i+"\t");
        }
    }
}
