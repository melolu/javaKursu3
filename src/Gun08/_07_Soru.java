package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        //girilen bir cumledeki ilk iki kelimeyi yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle giriniz=");
        String sentence = scan.nextLine();
        int firstSpace = sentence.indexOf(" ");
        int secondSpace = sentence.indexOf(" ", firstSpace + 1);

        String firstAndSecond = sentence.substring(0, secondSpace);
        System.out.println("ilk ve ikinci kelime = " + firstAndSecond);
        System.out.println("ilk ve ikinci kelime = " + sentence.substring(0, sentence.indexOf(" ", sentence.indexOf(" ") + 1)));


    }
}
