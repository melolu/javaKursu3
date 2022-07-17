package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //girilen bir ogrencinin notuna gore 50den buyuk esit ise gectiniz
        //kucuk ise kaldiniz yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.print("notu giriniz=");
        int not = scan.nextInt();

        if (not >= 50){
            System.out.println("gectiniz");
        }
        else {
            System.out.println("kaldiniz");
        }
    }
}
