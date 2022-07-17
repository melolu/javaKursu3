package Gun14;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
        //sayi bulma oyunu
        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi bulma oyununa hosgeldiniz!");
        System.out.print("Lutfen alt sinir belirleyiniz=");
        int altSinir= scan.nextInt();
        System.out.print("Lutfen ust sinir belirleyiniz=");
        int ustSinir= scan.nextInt();
        int random=(int)(Math.random()*ustSinir)+altSinir;
        int sayac=0;
        int tahmin=0;

        do {
            System.out.print("Tahmininizi giriniz=");
            tahmin= scan.nextInt();
            sayac++;


        }while (tahmin!=random);
        System.out.println("Tebrikler tahmininiz dogru, tutulan sayi="+random+", deneme sayiniz="+sayac);


    }
}
