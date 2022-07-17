package Gun25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru {
    public static void main(String[] args) {
        //Kullaniciya asagidaki gibi bir menu cikariniz
        //1-Ekleme(Bu secenekte kelimenin kendisi ve manasini bir cumle ile yaziniz)
        //2-Duzeltme(Bu secenekte kullaniciya kelimenin manasini duzelttiriniz)
        //3-Listeleme
        //4-Arama(Bu secenekte verilen bir kelimeyle baslayan tum kelimelerin manalari)
        //5-Silme
        //6-Cikis

        Map<String,String> sozluk=new TreeMap<>();
        Scanner scint=new Scanner(System.in);
        Scanner scstr=new Scanner(System.in);
        String kelime="";
        String anlam="";
        int secim=0;
        do {
            System.out.println("Menu\n1-Ekleme\n2-Duzeltme\n3-Listeleme\n4-Arama\n5-Silme\n6-Cikis");
            secim= scint.nextInt();

        switch (secim){
            case 1:
                System.out.print("Kelimeyi giriniz=");
                kelime= scstr.nextLine();
                System.out.print("Anlamini giriniz=");
                anlam= scstr.nextLine();
                sozluk.put(kelime,anlam);
                break;
            case 2:
                //TODO: kelime var mi yok mu kontrolu yapilacak
                System.out.print("Duzeltilecek kelimeyi giriniz=");
                kelime= scstr.nextLine();
                System.out.println("Dogru anlami giriniz=");
                anlam= scstr.nextLine();
                sozluk.put(kelime,anlam);
                break;
            case 3:
                System.out.println("sozluk = " + sozluk);break;
            case 4:break;
            case 5:break;
        }
        }while (secim<6);
            //TODO: butun islemler burda yapildiktan sonra, metod ile butun islemleri ayiriniz


    }
}
