package Gun21;

import java.util.Scanner;

public class _04_JavaMethod {
    //kullanicidan ogrenci adi ve notlariniz (60 70 90...) seklinde 3 ogrenci ve 3 ders notu aliniz
    //bunlarin ortalamasini bir methodda bulduktan sonra sonucu ekrana ismet 75 seklinde main icinde yazdiriniz
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        for (int i = 0; i < 3; i++) {


            System.out.print("Ogrenci adi:");
            String ad = scan.nextLine();

            System.out.print("Ogrenci notlari=");
            String notlar = scan.nextLine();
            int ort = ortalamaBul(notlar);
            System.out.println(ad + " " + ort);
        }
    }
    public static int ortalamaBul(String notlar){
        int ort=0;
        String[] notDizisi=notlar.split(" ");

        int toplam=0;
        for (int i = 0; i < notDizisi.length; i++) {
            toplam=toplam+Integer.parseInt(notDizisi[i]);

        }
        return toplam/ notDizisi.length;
    }
}
