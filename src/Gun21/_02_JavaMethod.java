package Gun21;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {
        //kullanicinin girecegi 2 sayidan buyuk olani bulma islemini bir metodda yaptiktan sonra mainde yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("1.sayi gir=");
        int sayi1 = scan.nextInt();
        System.out.print("2.sayi gir=");
        int sayi2 = scan.nextInt();
        System.out.println("buyuk sayi = " + buyukOlan(sayi1,sayi2));
    }

    public static int buyukOlan(int sayi1, int sayi2) {

        int enbuyuk;
        if (sayi1>sayi2)
            enbuyuk=sayi1;
        else enbuyuk=sayi2;
        return enbuyuk;
    }
}


