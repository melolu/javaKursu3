package Gun19;

import java.util.Scanner;

public class OzelSoru7 {
    //7- Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false
    //yazdırınız.
    //Not: sqrt gibi fonksiyonları kullanmayın.
    //Example 1:
    //Input: 16
    //Output: true
    //Not: bu sayı tam kare çünkü 4*4 = 16
    //Example 2:
    //Input: 14
    //Output: false (14 tam kare degil)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        double sayi= sc.nextInt();
        int sayac=0;
        for (double i = 1; i < sayi; i++) {
            if (sayi/i==i)
                sayac++;
        }
        if (sayac==1)
            System.out.println("true");
        else System.out.println("false");
    }
}
