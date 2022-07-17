package Gun13;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        //girilen bir sayinin onlar basamaginin degerini yazi ile yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi girin=");
        int sayi= scan.nextInt();
        int onlar=(sayi/10)%10;

        switch (onlar){
            case 0: System.out.println("sifir"); break;
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("uc"); break;
            case 4: System.out.println("dort"); break;
            case 5: System.out.println("bes"); break;
            case 6: System.out.println("alti"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz"); break;
            case 9: System.out.println("dokuz"); break;
        }
    }
}
