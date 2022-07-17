package Gun19;

import java.util.Scanner;

public class OzelSoru3 {
    public static void main(String[] args) {
        //3- Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
        Scanner sc=new Scanner(System.in);
        System.out.print("bir string girisi yapiniz:");
        String str= sc.nextLine();
        String byok=str.replaceAll("b","");
        int sayi=(str.length()-byok.length());
        System.out.println("girilen ifadedeki b sayisi = " + sayi);
    }
}
