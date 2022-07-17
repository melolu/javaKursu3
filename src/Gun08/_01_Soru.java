package Gun08;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        //ayri ayri girilen ad ve soyadi aralarinda bir bosluk koyarak birlestiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("Ad giriniz=");
        String name=scan.nextLine();
        System.out.print("Soyad giriniz=");
        String surname= scan.nextLine();
        System.out.println("adiniz ve soyadiniz="+ name.concat(" ").concat(surname));

    }
}
