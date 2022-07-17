package Gun20;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev5 {
    //5-getSum isminde bir method oluşturun.Parametresi ArrayList'tir.
    // Dizideki tüm $ ları kaldır ve tüm sayıları topla return yaptğımız veri tipi 'int' olmalıdır.
    // sonuç 0'dan küçükse, -1 yazdırın.
    // Örnek1:ArrayList = $13, $15, $20
    // Cevap = 48 olmalı
    // Örnek 2 :ArrayList= $-13, $0, $0Cevap = -1 olmalı.

    public static void main(String[] args) {
        int sayac = 0;
        ArrayList<String> paralar = new ArrayList<>();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Para giriniz,orn($20)=");
            String sayi= sc.next();
            paralar.add(sayi);
            sayac++;
        } while (sayac < 3);
        System.out.println("getSum(paralar) = " + getSum(paralar));
    }
    public static int getSum(ArrayList<String> paralar) {
        int top = 0;
        int birimsiz=0;
        for (int i = 0; i < paralar.size(); i++) {
            birimsiz = Integer.parseInt(paralar.get(i).replaceAll("[^\\d-]", ""));
            top = top + birimsiz;
        }
        if (top < 0) {
            return -1;
        }
        else return top;
    }
}
