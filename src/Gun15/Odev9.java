package Gun15;

import java.util.Scanner;

public class Odev9 {
    public static void main(String[] args) {
        //9-Girilen bir cümledeki kelimelerin baş harflarini yazdırınız.(Regex kullanmayın)

        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle giriniz=");
        String cumle= scan.nextLine();


        System.out.print(cumle.charAt(0));
        for (int i=0;i<cumle.length();i++){

            if (cumle.charAt(i)==' ')
                System.out.print(" "+cumle.charAt(i+1));

        }
    }
}
