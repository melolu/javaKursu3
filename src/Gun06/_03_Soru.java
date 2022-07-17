package Gun06;

import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //Girilen bir stringin sadece son harfini yazdiriniz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir kelime giriniz:");
        String kelime= oku.nextLine();
        int uzunluk=kelime.length();
        char sonHarf=kelime.charAt(uzunluk-1); //toplam karakter sayisi charAt isteminde indexe bagli oldugu icin -1 eklendi
        System.out.println("son harf = " + sonHarf);
        System.out.println("sonHarf = " + kelime.charAt(kelime.length()-1));

    }
}
