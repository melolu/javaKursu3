package Gun19;

import java.util.Random;
import java.util.Scanner;

public class OzelSoru9 {
    //9- Kullanıcıdan pozitif bir sayı alınız ve 0 ile girilen sayı arasında Random int tipinde bir sayı
    //üreten programı yazınız.
    //not : girilen sayı üretilen sayılara dahil olmalı
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz=");
        int sayi= sc.nextInt();
        int random= (int)(Math.random()*(sayi+1));
        System.out.println("random = " + random);
    }
}
