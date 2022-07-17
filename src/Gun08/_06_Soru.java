package Gun08;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        //girilen bir cumledeki ilk kelimeyi yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir cumle giriniz=");
        String sentence=scan.nextLine();
        String firstWord=sentence.substring(0,sentence.indexOf(" "));
        System.out.println("cumlenin ilk kelimesi= " + firstWord);
    }
}
