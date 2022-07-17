package Gun19;

import java.util.Scanner;

public class OzelSoru10 {
    //10- Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Alt sinir giriniz=");
        int altSinir= sc.nextInt();
        System.out.print("Ust sinir giriniz=");
        int ustSinir= sc.nextInt();

        int random=(int)(Math.random()*(ustSinir-altSinir))+altSinir;

        System.out.println("random = " + random);

    }
}
