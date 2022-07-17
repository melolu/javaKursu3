package Gun26;

import java.util.Scanner;

public class _01_JavaClassAndObject {

    //metod yazilabilen yer
    public static void main(String[] args) {
        //ana programin basladigi ve calistigi yer
        int sayi=5;
        Scanner sc=new Scanner(System.in);
        Araba benimArabam=new Araba(); //Araba tur, benimArabam objedir
        benimArabam.renk="Kirmizi";
        benimArabam.motorHacmi=1.6;
        benimArabam.yili=2020;
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam.yili = " + benimArabam.yili);

    }
    //metod yazilabilen yer
}

class Araba{
    //bu bolume class diyoruz ve bu sekilde tanimlaniyor
    String renk;
    int yili;
    double motorHacmi;
}
