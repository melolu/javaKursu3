package Gun13;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        //girilen 2 tam sayiyi kullanicidan aldiktan sonra toplama icin t cikarma icin c carpma icin p bolme icin b harflerini alarak
        //istege uygun olan islemi yaptirip sonucu yazdiriniz(switch ile)
        Scanner scan=new Scanner(System.in);
        System.out.print("1.sayiyi girin=");
        int sayi1= scan.nextInt();
        System.out.print("2.sayiyi girin=");
        int sayi2= scan.nextInt();
        System.out.println("Toplama icin T\nCikarma icin C\nCarpma icin P\nBolme icin B'ye basiniz.");
        Scanner scan2=new Scanner(System.in);
        String islem=scan2.next();

        switch (islem.toUpperCase()){
            case "T":
                System.out.println("sonuc="+(sayi1+sayi2)); break;
            case "C":
                System.out.println("sonuc="+(sayi1-sayi2)); break;
            case "P":
                System.out.println("sonuc="+(sayi1*sayi2)); break;
            case "B":
                System.out.println("sonuc="+(sayi1/sayi2)); break;
            default:
                System.out.println("gecersiz islem");
        }
    }
}
