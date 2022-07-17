package Gun12;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        //girilen bir sayiya kadar random sayi ureterek tahmin etmeye calisiniz. kullanici bilirse tebrikler yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("kaca kadar sayi uretmek istersiniz?= ");
        int istek= scan.nextInt();
        double random=Math.random();
        int uretilen=(int)(random*istek);
        System.out.print("tahmininizi giriniz=");
        int tahmin= scan.nextInt();

        if (uretilen==tahmin){
            System.out.println("tebrikler bildiniz");
        }
        else {
            System.out.println("bilemediniz, sayi="+uretilen);
        }
    }
}
