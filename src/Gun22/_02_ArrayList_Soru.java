package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    //bir ogretmenden girmek istedigi kadar notu aliniz ve ortalamayi gecen ogrenci sayisini bulunuz
    //ogretmene devam etmek istiyor musunuz(E/H) seklinde sorunuz
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner scInt=new Scanner(System.in);

        String ans="";
        ArrayList<Integer> notlar=new ArrayList<>();
        int toplam=0;
        do {

            System.out.print("Not=");
            int ogrNot= scInt.nextInt();
            notlar.add(ogrNot);
            toplam+=ogrNot;

            System.out.print("Devam etmek istiyor musunuz?(E/H) ");
            ans= sc.next();

        }while (ans.equalsIgnoreCase("E"));

        //System.out.println("notlar = " + notlar); kontrol amacli yazdik dongu dogru calisiyor mu diye
        int ort=toplam/notlar.size();

        System.out.println("ort = " + ort);

        gecenSayisiYaz(notlar,ort);
        int gecenSayisi=gecenSayisiBul(notlar,ort);

    }
    public static void gecenSayisiYaz(ArrayList<Integer> diziList, int ort){
        int gecenSayisi=0;
        for (int i = 0; i < diziList.size(); i++) {
            if (diziList.get(i)>=ort)
                gecenSayisi++;
        }

        System.out.println("gecenSayisi = " + gecenSayisi);
    }
    public static int gecenSayisiBul(ArrayList<Integer> diziList, int ort){
        int gecenSayisi=0;
        for (int i = 0; i < diziList.size(); i++) {
            if (diziList.get(i)>=ort)
                gecenSayisi++;
        }
        return gecenSayisi;

    }
}
