package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        tekCift(55);
        tekCift(66);
        tekCiftOku();
    }
    public static void tekCift(int sayi){
        if (sayi%2==0)
            System.out.println("cift");
        else System.out.println("tek");
    }

    public static void tekCiftOku(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        int sayi=scan.nextInt();
        if (sayi%2==0)
            System.out.println("cift");
        else System.out.println("tek");

    }
}
