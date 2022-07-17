package Gun15;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {
        //3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.
        Scanner scan=new Scanner(System.in);
        System.out.println("Toplam 10 adet sayi giriniz");
        int sayac=0;
        int toplam=0;
        while (sayac<10){
            System.out.print("Bir sayi giriniz=");
            int sayi= scan.nextInt();
            sayac++;
            if (sayi%2==0){
                toplam=toplam+sayi;

            }

            else break;
        }
        System.out.println("toplam = " + toplam);

    }
}
