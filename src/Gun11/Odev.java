package Gun11;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //1- Girilen 3 sayıdan büyük olanı yazdırınız
        Scanner scan = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz=");
        int sayi1 = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz=");
        int sayi2 = scan.nextInt();
        System.out.print("ucuncu sayiyi giriniz=");
        int sayi3 = scan.nextInt();

        /*if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println("sayi1");
        }
        else {
            if (sayi2>sayi3){
                System.out.println("sayi2");
            }
            else {
                System.out.println("sayi3");
            }
        }*/

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println("ilk girilen sayi="+sayi1+" en buyuk sayidir.");
        }
        if (sayi2 > sayi1 && sayi2 > sayi3) {

            System.out.println("ikinci girilen sayi="+sayi2+" en buyuk sayidir.");
        }
        if (sayi3>sayi1 && sayi3>sayi2){

            System.out.println("-->ucuncu girilen sayi="+sayi3+" en buyuk sayidir.");
        }

        //2- Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup oladığını kontrol ediniz.
        System.out.print("bir sayi giriniz=");
        int number= scan.nextInt();
        int birler=number%10;
        int onlar=(number/10)%10;

        if (birler==onlar && birler%2==1 ){
            System.out.println("birler ve onlar basamagi hem tek hem esitlerdir.");
        }
        else {
            System.out.println("kosullar saglanmiyor.");
        }

        //3- Girilen bir keliede bosluk veya A harfinin olup olmadığını kontrol ediniz.
        System.out.print("bir kelime giriniz=");
        String kelime= scan.next();
        boolean boslukVarMi=kelime.contains(" ");
        boolean AvarMi=kelime.contains("A");

        if (boslukVarMi|| AvarMi){
            System.out.println("A var mi? = " + AvarMi +","+"bosluk var mi? ="+ boslukVarMi);
        }
        else {
            System.out.println("kelimede a harfi veya bosluk yok");
        }

    }
}
