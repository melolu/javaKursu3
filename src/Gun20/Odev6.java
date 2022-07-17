package Gun20;

import java.util.Scanner;

public class Odev6 {
    //6-EvenOddNums isminde bir method oluşturun.Bu yöntem String olan bir parametreyi kabul etsin.
    // Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
    // Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.toplam sonucu yazdırın.
    // **İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.
    // **For example Örnek:String =  "6678421312"6+6-7+8+4+2-1-3-1+2sonuç 16 olmalı

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayi giriniz=");
        String strSayi= sc.next();

        EvenOddNums(strSayi);
    }
    public static void EvenOddNums(String a){
        long IntA=Long.parseLong(a);
        long toplam=0;
        do {
            if (IntA%2==0){
                toplam=toplam+IntA%10;
            }
            else {
                toplam=toplam-IntA%10;
            }
            IntA=IntA/10;
        }while (IntA>0);
        System.out.println("toplam = " + (int)toplam);
    }
}
