package Gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {


            Scanner sc = new Scanner(System.in);

            try {


                System.out.print("1.sayiyi giriniz=");//4
                int sayi1 = sc.nextInt();
                System.out.print("2.sayiyi giriniz="); //0
                int sayi2 = sc.nextInt();

                System.out.println("sayi1/sayi2 = " + (sayi1 / sayi2));

            } catch (Exception hata) {
                System.out.println(hata.getMessage());
            }
        }
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Gun43._02_JavaRuntimeException.main(_02_JavaRuntimeException.java:13)
    }
}
