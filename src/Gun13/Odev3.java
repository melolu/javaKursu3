package Gun13;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {

        int random=(int)(Math.random()*61)+20;

        int birler=random%10;
        System.out.println("random sayi="+random);
        switch (birler){
            case 0: System.out.print("sifir"); break;
            case 1: System.out.print("bir"); break;
            case 2: System.out.print("iki"); break;
            case 3: System.out.print("uc"); break;
            case 4: System.out.print("dort"); break;
            case 5: System.out.print("bes"); break;
            case 6: System.out.print("alti"); break;
            case 7: System.out.print("yedi"); break;
            case 8: System.out.print("sekiz"); break;
            case 9: System.out.print("dokuz"); break;
        }
    }
}
