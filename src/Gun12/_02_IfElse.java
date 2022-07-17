package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //girilen bir sayinin pozitif, negatif veya sifir oldugunu yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();

        if (sayi>0){
            System.out.println("sayi pozitif");
        }
        else {
            if (sayi<0) {
                System.out.println("sayi negatif");
            }
            else {
                System.out.println("sayi sifir");
            }
        }
    }
}
