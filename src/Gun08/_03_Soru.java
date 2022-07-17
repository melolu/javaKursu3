package Gun08;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //girilen bir cumledeki A harfi sayisini bulunuz(buyuk kucuk fark etmeksizin)
        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle giriniz=");
        String text=scan.nextLine();
        int textLength=text.length();
        String chngtext=text.toLowerCase().replace("a","");
        int chngtextLength=chngtext.length();
        System.out.println("Cumledeki a harfi sayisi = " + (textLength-chngtextLength));
    }
}
