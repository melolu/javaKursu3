package Gun20;

import java.util.Scanner;

public class Odev7 {
    //7-addDigits isminde bir method oluşturun.Parametresi int, Return tipi de int,
    // Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
    // Tek basamaklı çıktığında, döndürün
    // Örnek1:Girdi`38`
    // Çıktı:2
    // Açıklama: İşlemler şöyle olacak**: `3 + 8 = 11`, `1 + 1 = 2`
    // 2 , tek basamaklı olduğundan, bunu döndürün.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("bir sayi girin=");
        int sayi= sc.nextInt();
        if (addDigits(sayi)>10){
            System.out.println("addDigits(sayi) = " + addDigits(addDigits(sayi)));
        }
        else System.out.println("addDigits(sayi) = " + addDigits(sayi));
    }
    public static int addDigits(int a){
        int top=0;
        int tekrarTop=0;
        do {
            top=top+a%10;
            a=a/10;

        }while (a>0);
        return top;
    }
}
