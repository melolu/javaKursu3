package Gun12;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        //girilen sayi 50den buyuk ise 1, degilse 0 degerini ekrana yazdiriniz
        //ternary operatoru ile yapiniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();

        System.out.print(((sayi>50) ? 1 : 0));

    }
}
