package Gun23;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _01_Java2DArrayList {
    public static void main(String[] args) {
        //700001500158007313129867

        ArrayList<Integer> liste=new ArrayList<>();//istendigi kadar rakam eklenebilen degisken

        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>(); //listelerin listesi bunun her bir elemani arraylist

        ArrayList<Integer> matNotlar=new ArrayList<>();
        matNotlar.add(60);
        matNotlar.add(70);
        matNotlar.add(80);

        ArrayList<Integer> fizNotlar=new ArrayList<>();
        fizNotlar.add(65);
        fizNotlar.add(75);
        fizNotlar.add(85);

        ArrayList<Integer> kimNotlar=new ArrayList<>();
        kimNotlar.add(85);
        kimNotlar.add(95);
        kimNotlar.add(55);

        notlarListesi.add(matNotlar);
        notlarListesi.add(fizNotlar);
        notlarListesi.add(kimNotlar);

        notlarListesi.get(0); //matNotlari verir yani 0.elemani
        notlarListesi.get(0).get(0); //0,0 elemani verir

//        System.out.println("notlarListesi = " + notlarListesi.get(0));  bunlari yapmak yerine asagidaki
//        System.out.println("notlarListesi = " + notlarListesi.get(1));  for dongusunu yaziyoruz artik
//        System.out.println("notlarListesi = " + notlarListesi.get(2));

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesiForIle = " + notlarListesi.get(i));
        }

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        //tum notlar tek tek nasil yazdirilir hadi bakalim

        for (int i = 0; i < notlarListesi.size(); i++) { //liste uzunlugu veya yaprak sayisi gibi dusun

            System.out.println(dersler.get(i));
            for (int j = 0; j < notlarListesi.get(i).size(); j++) { //her bir yapraktaki yazi gibi dusun
                System.out.println((i+1)+".yaprak,"+(j+1)+".not" + notlarListesi.get(i).get(j));
            }
        }

        // 1-kullanicidan alinan ders nosuna gore ekrana notlarin listesini bir fonksiyonda yazdiriniz
        Scanner sc=new Scanner(System.in);
        System.out.print("Ders no girin=");
        int dersNo= sc.nextInt();
        dersNotlariniYazdir(notlarListesi,dersNo);


        //2-Yukarida girilen derse ait ortalamayi mainde yazdiriniz

        int ort=ortalamaBul(notlarListesi,dersNo);
        System.out.println("ort = " + ort);

        //3-tum derslerin not ortalamasini(double) bir fonksiyonda buldurup mainde yazdiriniz
        //4-en buyuk ve en kucuk notu bir main icinde  bulunuz
    }

    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo){

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.println(notlarListesi.get(dersNo).get(i));
        }
    }
    public static int ortalamaBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo){
        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam=toplam+notlarListesi.get(dersNo).get(i);
        }
        return toplam/notlarListesi.get(dersNo).size();
    }
}
