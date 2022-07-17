package Gun19;

import java.util.Scanner;

public class OzelSoru11 {
    //11- Girilen bir string deki harf sayısı tek ise true , değilse false yazdırınız.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("bir kelime giriniz=");
        String str= sc.next();

        if (str.length()%2==1)
            System.out.println("true");
        else System.out.println("false");
    }
}
