package Gun10;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //baklava dilimi = if :)
        //girilen bir sayinin 10dan buyuk ise ekrana 10dan buyuk yazdiriniz
        //algoritma
        //1-basla
        //2-sayi oku
        //3-sayi>10 ise 10dan buyuk yaz
        //4-dur

        Scanner scan=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi= scan.nextInt();
        if (sayi > 10){
            System.out.print("sayi 10dan buyuktur.");
        }
    }
}
