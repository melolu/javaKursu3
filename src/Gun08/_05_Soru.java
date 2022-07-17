package Gun08;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //girilen bir kelimenin ilk ve son harfini bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir kelime giriniz=");
        String word=scan.next();
        char ilkHarf=word.charAt(0);
        char sonHarf=word.charAt(word.length()-1);
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("sonHarf = " + sonHarf);


    }
}
