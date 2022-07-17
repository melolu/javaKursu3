package Gun14;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        //girilen bir sayiya kadar olan sayilarin toplamini bularak yazdirin, girilen sayi dahil
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();
        int sayac=0;
        int toplam=0;
        while (sayac<sayi){
            toplam=toplam+sayi-sayac;
            sayac++;
        }
        System.out.println("toplam="+toplam);
    }
}
