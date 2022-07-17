package Gun08;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //girilen bir kelimenin bos olup olmadigini yaziniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir kelime giriniz=");
        String text=scan.nextLine();
        System.out.println("text = " + text.isEmpty());
    }
}
