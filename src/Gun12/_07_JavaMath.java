package Gun12;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // math.max yontemi ile girilen 3 sayidan buyuk olani bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz=");
        int sayi1= scan.nextInt();
        System.out.print("ikinci sayiyi giriniz=");
        int sayi2= scan.nextInt();
        System.out.print("ucuncu sayiyi giriniz=");
        int sayi3= scan.nextInt();

        System.out.println("girilen sayilar arasinda en buyuk olan = " + Math.max(sayi1,Math.max(sayi2,sayi3)));
    }
}
