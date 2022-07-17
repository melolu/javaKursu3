package Gun11;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        //girilen bir stringin uzunlugu 10dan buyukse ve string icinde study kelimesi geciyorsa ekrana evet yazdirin degilse hayir yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.print("bir cumle giriniz=");
        String cumle = scan.nextLine();
        if (cumle.length() > 10 && cumle.contains("study")) {
            System.out.println("evet");
        } else {
            System.out.println("hayir");
        }
    }
}
