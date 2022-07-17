package Gun10;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayinin tek mi cift mi oldugunu yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();

        if (sayi<0) {
            sayi=sayi*-1;
        }
        if (sayi%2==0){
            System.out.print("girilen sayi cifttir");
        }
        if (sayi%2==1){
            System.out.print("girilen sayi tektir");
        }
    }
}
