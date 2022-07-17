package Gun19;

import java.util.Scanner;

public class OzelSoru2 {
    public static void main(String[] args) {
        //2- Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız.
        Scanner sc=new Scanner(System.in);
        System.out.print("bir sayi girin=");
        int sayi= sc.nextInt();
        if (sayi%2==0)
            System.out.println("true");
        else System.out.println("false");
    }
}
