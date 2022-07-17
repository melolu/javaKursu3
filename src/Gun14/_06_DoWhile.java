package Gun14;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        //kullanici 0 degeri girene kadar girdigi sayilarin toplamini bulunuz
        Scanner scan=new Scanner(System.in);
        //System.out.print("bir sayi giriniz=");
        //int sayi= scan.nextInt();
        int toplam=0;
        int sayi=0;
//
//        while(sayi!=0){
//
//            toplam=toplam+sayi;
//            System.out.print("bir sayi giriniz=");
//            sayi= scan.nextInt();
//
//        }
//        System.out.println("toplam="+toplam);

        //do while

        //toplam=0;
        do {
            System.out.print("bir sayi giriniz=");
            sayi= scan.nextInt();
            toplam=toplam+sayi;
        }while (sayi!=0);
        System.out.println("toplam="+toplam);
    }
}
