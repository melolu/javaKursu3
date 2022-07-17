package Gun09;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //girilen bir sayinin tek sayi olup olmadigini yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi=scan.nextInt();
        System.out.println("sayi tek mi?= " + (sayi%2==1));
    }
}
