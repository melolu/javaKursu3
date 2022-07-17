package Gun14;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        //kullanicida x girilne kadar ekrana "program calisiyor" yazan ve x girildiginde ise "program bitti" yazan programi yaziniz
        Scanner scan = new Scanner(System.in);
        String str="";
        do {
            System.out.println("Program calisiyor");
            System.out.print("bir harf giriniz=");
            str = scan.next();


        } while (!str.equalsIgnoreCase("x"));
        System.out.println("program bitti");
    }
}
