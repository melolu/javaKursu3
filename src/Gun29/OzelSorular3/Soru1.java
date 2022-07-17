package Gun29.OzelSorular3;

import java.util.Scanner;

public class Soru1 {
    //Parametresi int ve return tipi int olan power4 isminde method verilmiştir.
    //power4 metodu girilen int parametresinin rakamlarının ayrı ayrı 4.kuvvetini alıp toplayınız.
    //Örnek:
    //parameter int is 1234
    //1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256
    //result 354 olmalı.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int a= sc.nextInt();
        System.out.println(power4(a));

    }
    static int power4(int a){
        int toplam=0;
        do {
            toplam=toplam+(int)Math.pow(a%10,4);
            a=a/10;
        }while (a>0);
        return toplam;
    }
}
