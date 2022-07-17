package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        //kullanici adini ve soyadini ayri ayri okutarak alip birlikte ekrana yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Lutfen adinizi giriniz: ");

        String ad=oku.nextLine();

        System.out.print("Lutfen soyadinizi giriniz: ");

        String soyad=oku.next();

        System.out.println("Adiniz ve soyadiniz:"+ad+" "+soyad);
    }
}
