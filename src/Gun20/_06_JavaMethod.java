package Gun20;

import java.util.Scanner;

public class _06_JavaMethod {
    //kullaniciya asagidaki gibi bir menu cikartarak surekli degiskenleri aliniz ve her bir menu elemanini deger
    //alan fonksiyon olarak yaziniz
        /* 1-toplama
            2-cikarma
            3-carpma
            4-bolme
            5-faktoriyel
            6-cikis
            Bir islem seciniz
         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secim = 0;

        do {
            menuYaz();
            secim = scan.nextInt();
            if (secim < 6 && secim > 0)
            islemiYap(secim);

        } while (secim < 6 && secim > 0);

    }

    public static void menuYaz() {
        System.out.print(
                "1-toplama\n" +
                        "2-cikarma\n" +
                        "3-carpma\n" +
                        "4-bolme\n" +
                        "5-faktoriyel\n" +
                        "6-cikis\nSeciminiz=");
    }

    public static void islemiYap(int secim) {
        Scanner scan = new Scanner(System.in);
        int sayi1 = 0;
        int sayi2 = 0;

        if (secim < 5) {

            System.out.print("1.sayi=");
            sayi1 = scan.nextInt();
            System.out.print("2.sayi=");
            sayi2 = scan.nextInt();
        } else {
            System.out.print("sayi=");
            sayi1 = scan.nextInt();

        }

        switch (secim) {
            case 1:
                System.out.println("toplam="+ (sayi1 + sayi2)+"\n");
                break;
            case 2:
                System.out.println("cikarma="+ (sayi1 - sayi2)+"\n");
                break;
            case 3:
                System.out.println("carpma="+ (sayi1 * sayi2)+"\n");
                break;
            case 4:
                System.out.println("bolme="+ (sayi1 / sayi2)+"\n");
                break;
            case 5:
                int fakt = 1;
                for (int i = 1; i <= sayi1; i++) {
                    fakt = fakt * i;
                }
                System.out.println("faktoriyel = " + fakt+"\n");
                break;
        }

    }
}
