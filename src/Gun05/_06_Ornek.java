package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        //bir karenin kenarini kullanicidan isteyip cevresini ve alanini bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Lutfen karenin kenar uzunlugunu giriniz=");
        int kareKenari= oku.nextInt();
        int cevre=kareKenari*4;
        int alan=kareKenari*kareKenari;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);
    }
}
