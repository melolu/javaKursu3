package Gun09;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //girilen 3 basamakli bir sayinin tersi olan sayiyi bulunuz
        //524 -> 425 gibi
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz = ");
        int sayi=scan.nextInt();
        int ilk=(sayi%10), orta=(sayi/10)%10, son=(sayi/100)%10;
        System.out.println("sayinin tersi = " + (ilk*100+orta*10+son));
    }
}
