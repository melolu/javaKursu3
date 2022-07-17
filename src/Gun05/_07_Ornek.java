package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // kisinin agirligini double, boyunu int olarak degerler aliniz
        // bir satirda boyunuz ... ve kilonuz ... seklinde yaziniz.
        // ve vucut kitle indeksini hesaplayiniz (kilo/boy*boy)
        Scanner oku=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz:");
        double kilo= oku.nextDouble();
        System.out.print("Boyunuzu giriniz:");
        int boy= oku.nextInt();
        double index=(kilo / (boy*boy)) * 10000;
        System.out.println("boyunuz = " + boy);
        System.out.println("kilonuz = " + kilo);
        System.out.println("Vucut kitle endeksiniz = " + index);
    }
}
