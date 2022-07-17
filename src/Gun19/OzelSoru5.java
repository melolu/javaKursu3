package Gun19;

import java.util.Scanner;

public class OzelSoru5 {
    //5- Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
    //number:6
    //factorial:1*2*3*4*5*6=720
    //output ---> 720
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi= sc.nextInt();
        int fakt=1;
        for (int i = 1; i <= sayi; i++) {
            fakt=fakt*i;
        }
        System.out.println("faktoriyel = " + fakt);

    }
}
