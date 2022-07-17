package Gun11;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        //mantiksal ifadeler
        //&& ve , || veya demek

        //girilen sayi pozitif ve tek ise ekrana 'uygun sayi girildi'
        //degilse 'uygun sayi girilmedi' yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi = scan.nextInt();
        if (sayi > 0 && sayi % 2 == 1){
            System.out.println("uygun sayi girildi");
        }
        else {
            System.out.println("uygun sayi girilmedi");
        }
    }
}
