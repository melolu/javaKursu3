package Gun15;

import java.util.Scanner;

public class Odev7 {
    public static void main(String[] args) {
        //7-Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)
        Scanner scan=new Scanner(System.in);
        System.out.print("Cumle girin=");
        String cumle= scan.nextLine();

        int miktar=0;

        for (int i=0;i<cumle.length();i++){

            if (cumle.charAt(i)=='a')
                miktar++;
        }
        System.out.println("miktar = " + miktar);
    }
}
