package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        //kullanicidan alacaginiz 2 tam sayinin toplamini ekrana yazdiriniz
        //benim yaptigim
        /* Scanner oku=new Scanner(System.in);

        System.out.print("Lutfen 2 tam sayi giriniz=");

        int toplam=oku.nextInt()+ oku.nextInt();

        System.out.println("toplam = " + toplam);
        */
        //hocanin yaptigi
        Scanner oku=new Scanner(System.in);
        System.out.print("Birinci sayi=");
        int sayi1=oku.nextInt();

        System.out.print("ikinci sayi=");
        int sayi2= oku.nextInt();

        //1.yontem
        int toplam=sayi1+sayi2;
        System.out.println("toplam = " + toplam);
        //2.yontem
        System.out.println("toplam = " + (sayi1+sayi2));
        //stringlere dikkat
        System.out.println("toplam = " + sayi1+sayi2); //rakamlari yan yana yazdirdi cunku toplama isleminde bir string
        //var ise digerleri otomatik string olur
    }
}
