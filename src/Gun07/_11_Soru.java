package Gun07;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        //girilen bir stringdeki nokta sayisini bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir text giriniz=");
        String text= oku.nextLine();
        String noktasiz=text.replace(".","");
        int noktaSayisi=text.length()-noktasiz.length();
        System.out.println("noktaSayisi = " + noktaSayisi);

        //girilen cumledeki noktalari sildik
        //girilen cumlenin uzunlugunu bulduk
        //noktalarin silindigi cumle uzunlugunu bulduk
        //ilk uzunluktan son uzunlugu cikararak toplam nokta sayisini bulduk.
    }
}
