package Gun11;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //girilen bir sayinin tek mi cift mi oldugunu yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();
        if (sayi<0){
            sayi=sayi*-1;
        }
        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }
        else {
            System.out.println("sayi tektir");
        }
    }

}
