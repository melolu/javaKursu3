package Gun20;

import java.util.Scanner;

public class Odev2 {
    //2-"OrtaKelime" isminden bir method oluşturun.Bu method String'i parametre olarak almalı.
    // Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.Ortadaki kelimeyi return yapınız.
    // Örnek: Ben Java'yı seviyorum.print : Java'yı
    // Örnek2:Java'yı kolayca öğreniyorum.print: kolayca

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir cumle giriniz=");
        String cumle = sc.nextLine();
        OrtaKelime(cumle);
    }
    public static void OrtaKelime(String a) {
        String[] split=a.split(" ");
        for (int i = 0; i < split.length; i++) {

        }
        if (split.length%2==0){
            System.out.println("orta kelime = " + split[(split.length/2)-1]);
            System.out.println("orta kelime = " + split[(split.length/2)]);
        }
        else System.out.println("orta kelime = " + split[(split.length-1)/2]);
    }
}
