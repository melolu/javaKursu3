package Gun20;

import java.util.Scanner;

public class Odev8 {
    //8-powerOfThree isminde bir method oluşturun.Parametre olarak int,Return tipi boolean
    // Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin.
    // 3'ün üssü(kuvveti) ise true, değilse false döndürün.
    // Örnek 1:Girdi:*27* Çıktı:*true*
    // Açıklama: 3*3*3 =27 Sonuç=*true*
    // Örnek 2:*Girdi:*0* Çıktı:*false*
    // Örnek 3:*Girdi:*9* Çıktı:*true*

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= sc.nextInt();
        System.out.println("powerOfThree(sayi) = " + powerOfThree(sayi));
    }
    public static boolean powerOfThree(int a){

        if (a<1) return false;
        else while (a%3==0){
            a=(a/3);
        }
        if (a==1) return true;
        else return false;
    }
}
