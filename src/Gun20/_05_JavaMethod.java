package Gun20;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        //kullanicidan 5 elemanli bir diziyi doldurduktan sonra dizinin en kucuk,en buyuk elemanini ve ortalamasini
        //bulduktan sonra bu dizinin butun elemanlarinin karelerini yeni bir diziye atiniz
        //bu dizinin de en kucuk,en buyuk elemanini ve ortalamasini bulunuz
        Scanner scan=new Scanner(System.in);
        int[] dizi1=new int[5];

        for (int i = 0; i < dizi1.length; i++) {
            System.out.print("5 elemanli bir diziyi doldurun=");
            dizi1[i]= scan.nextInt();
        }
        enk(dizi1);
        enb(dizi1);
        ort(dizi1);

        int[] diziKare=new int[5];
        for (int i = 0; i < diziKare.length; i++) {
            diziKare[i]=dizi1[i]*dizi1[i];
        }
        enk(diziKare);
        enb(diziKare);
        ort(diziKare);

    }
    public static void enk(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("en kucuk = " + dizi[0]);
    }
    public static void enb(int[] dizi){
        Arrays.sort(dizi);
        System.out.println("en buyuk = " + dizi[dizi.length-1]);
    }
    public static void ort(int[] dizi){
        int toplam=0;

        for (int i = 0; i < dizi.length; i++) {
            toplam=toplam+dizi[i];
        }
        int ort=toplam/ dizi.length;
        System.out.println("ort = " + ort);
    }


}
