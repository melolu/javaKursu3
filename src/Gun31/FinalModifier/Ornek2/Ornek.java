package Gun31.FinalModifier.Ornek2;


import java.util.Scanner;

public class Ornek {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan saat, dakika ve saniyeyi alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {

        int gun=0;
        int saat=0;
        int dakika=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Gun");
        gun= sc.nextInt();
        System.out.print("Saat");
        saat= sc.nextInt();
        System.out.print("Dakika");
        dakika= sc.nextInt();

        int toplamSaniye=gun*Sabitler.saat*Sabitler.dakika*Sabitler.saniye
                +saat*Sabitler.dakika*Sabitler.saniye
                +dakika*Sabitler.saniye;
        System.out.println("toplamSaniye = " + toplamSaniye);

        System.out.println("toplam saniye = " + Sabitler.hesapla(gun, saat, dakika));
    }

}
