package Gun08;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle yaziniz= ");
        String cumle=scan.nextLine();
        char ilkHarf=cumle.charAt(0);
        char sonHarf=cumle.charAt(cumle.length()-1);
        System.out.println("cumlenin ilk ve son harfi = " + ilkHarf +","+ sonHarf);

        System.out.print("3 kelimelik bir cumle giriniz =");
        String cumle2=scan.nextLine();
        String ilkKelime=cumle2.substring(0,cumle2.indexOf(" "));
        String ikinciKelime=cumle2.substring(cumle2.indexOf(" ")+1,cumle2.lastIndexOf(" "));
        String sonKelime=cumle2.substring(cumle2.lastIndexOf(" ")+1);
        System.out.println("ilkKelime =" + ilkKelime);
        System.out.println("ikinciKelime =" + ikinciKelime);
        System.out.println("sonKelime =" + sonKelime);

        char ilkKelimeilkHarf=ilkKelime.charAt(0);
        char ikinciKelimeIlkHarf=ikinciKelime.charAt(0);
        char sonKelimeIlkHarf=sonKelime.charAt(0);
        System.out.println("kelimelerin ilk harfleri = " + ilkKelimeilkHarf+","+ikinciKelimeIlkHarf+","+sonKelimeIlkHarf);

        System.out.print("Bir kelime yaziniz=");
        String kelime=scan.next();
        boolean varMi=kelime.contains("B");
        System.out.println("kelimede B harfi var mi? = " + varMi);

        System.out.print("Kredi karti numaranizi bosluk birakmadan 16 sayi olacak sekilde giriniz=");
        String kartNo=scan.next();
        String sansurlu=kartNo.substring(0,11).replaceAll("[0-9]","*");
        System.out.println("sansurlu = " + sansurlu+kartNo.substring(12));

        Scanner scan2=new Scanner(System.in);
        System.out.print("Bir cumle giriniz=");
        String cumle3=scan2.nextLine();
        String sonKelime2=cumle3.substring(cumle3.lastIndexOf(" ")+1);
        System.out.println("cumlenin son kelimesi = " + sonKelime2);
    }
}
