package Gun15;

import java.util.Scanner;

public class Odev8 {
    public static void main(String[] args) {
        //8-Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmayın)

        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle girin=");
        String cumle= scan.nextLine();

        int miktar=0;

        for (int i=0;i<cumle.length();i++){

            if (cumle.charAt(i)==' ')
                miktar++;
        }
        System.out.println("miktar = " + (miktar+1));
    }
}
