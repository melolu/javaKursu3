package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        Scanner okuyucu=new Scanner(System.in);

        System.out.print("Sayi giriniz=");
        int sayi=okuyucu.nextInt();

        System.out.println("Girdiginiz sayi = " + sayi);
    }
}
