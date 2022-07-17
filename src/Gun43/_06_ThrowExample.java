package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Kullanici=");
        String username= sc.nextLine();
        System.out.print("Sifre=");
        String password= sc.nextLine();


        try {
            if (password.length()<8)
                throw new Exception("sifre 8 karakterden az olamaz");
            if (password.length()>15)
                throw new Exception("Sifre 15 karakterden buyuk olamaz");
        } catch (Exception e)
        {
            System.out.println("lutfen dikkat!");
            System.out.println("Uyari="+e.getMessage());
            // log tutuluyor.
            // kimler bu hatalı girişleri yapmış
            // ....
            // bir çok kontrol tek yerde toplanıyor.
        }
            // throw ile kendimiz hata oluşturuyoruz.
            // böylece kritelerimize girmeyenler için de
            // catch bloğunua düşürerek, paratik kullanım sağlıyoruz.
            // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
            // break gibi programın devamının çalışmasını engelliyoruz.
    }
}
