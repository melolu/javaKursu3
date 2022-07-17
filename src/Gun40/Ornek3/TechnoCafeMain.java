package Gun40.Ornek3;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Food> siparis=new ArrayList<>();
        int secim;
        int sayar1=0;
        int sayar2=0;
        int sayar3=0;
        int sayar4=0;
        do {
            menuGoster();
            secim = sc.nextInt();

            switch (secim){
                case 1: AdanaKebap ak=new AdanaKebap();
                siparis.add(ak);
                sayar1++;break;
                case 2: Lahmacun lah=new Lahmacun();
                siparis.add(lah);
                sayar2++;break;
                case 3: Borsh bor=new Borsh();
                siparis.add(bor);
                sayar3++;break;
                case 4: Palov pl=new Palov();
                siparis.add(pl);
                sayar4++;break;
            }


        } while (!(secim == 0));
        System.out.println("siparisiniz hazirlaniyor...");
        menuYaz(sayar1,sayar2,sayar3,sayar4);

        System.out.println("Toplam hesabiniz="+fiyatYaz(siparis)+"TL");

    }
    public static void menuGoster(){
        System.out.println("****MENU****");
        System.out.println("1-Adana Kebap (55 TL)");
        System.out.println("2-Lahmacun (33 TL)");
        System.out.println("3-Borsch (22 TL)");
        System.out.println("4-Palov (44 TL)");
        System.out.println("0-TAMAM");
    }
    public static double fiyatYaz(ArrayList<Food> siparis){
        double toplam=0;
        for (int i=0; i<siparis.size();i++){

            toplam=toplam+siparis.get(i).ucret();
        }
        return toplam;
    }
    public static void menuYaz(int sayar1, int sayar2, int sayar3, int sayar4){
        if (sayar1>0){
            System.out.println(sayar1+"adet Adana Kebap");
        }
        if (sayar2>0){
            System.out.println(sayar2+"adet Lahmacun");
        }
        if (sayar3>0){
            System.out.println(sayar3+"adet Borsh");
        }
        if (sayar4>0){
            System.out.println(sayar4+"adet Palov");
        }
        System.out.println("siparis edilmistir");
    }
}
