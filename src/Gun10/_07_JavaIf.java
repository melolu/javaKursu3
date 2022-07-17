package Gun10;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //girilen bir ogrencinin notuna gore 50den buyuk-esit ise gectiniz
        //kucuk ise kaldiniz yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Notunuzu giriniz=");
        int not = scan.nextInt();

        if (not >= 50) {
            System.out.print("Dersi gectiniz");
        }
        if (not < 50) {
            System.out.print("Dersten kaldiniz");
        }
    }
}
