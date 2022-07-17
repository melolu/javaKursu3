package Gun09;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi1=scan.nextInt();
        System.out.print("ikinci sayiyi giriniz=");
        int sayi2= scan.nextInt();
        System.out.println(sayi1+"/"+sayi2+"="+(sayi1/sayi2));

        System.out.print("Bir sayi giriniz=");
        int num1= scan.nextInt();
        System.out.print("ikinci sayiyi giriniz=");
        int num2= scan.nextInt();
        int sonuc=num1/num2;
        System.out.println(num1+"/"+num2+" isleminin sonucu = " + sonuc);

        System.out.print("ondalikli bir sayi giriniz=");
        double d1= scan.nextDouble();
        System.out.print("ondalikli ikinci bir sayi giriniz=");
        double d2= scan.nextDouble();
        System.out.print("ondalikli ucuncu bir sayi giriniz=");
        double d3= scan.nextDouble();
        double sonuc2=d1*d2*d3;
        System.out.println(d1+"*"+d2+"*"+d3+" isleminin sonucu = " + sonuc2);

        double do1=1.45, do2=2.3, do3=5.5, do4=1.625;
        double carpim=do1*do2*do3*do4;
        System.out.println(do1+"*"+do2+"*"+do3+"*"+do4+"*"+"sayilarin carpimi = " + carpim);

        int int1=5, int2=4, int3=11, int4=9;
        int carp=int1*int2*int3*int4;
        System.out.println(int1+"*"+int2+"*"+int3+"*"+int4+"*"+" sayilarin carpimi = " + carp);

        System.out.print("Bir sayi giriniz=");
        int say1= scan.nextInt();
        System.out.print("Ikinci bir sayi giriniz=");
        int say2= scan.nextInt();
        int kalan=say1%say2;
        System.out.println(say1+"/"+say2+" isleminden kalan = " + kalan);

        System.out.print("Bir sayi giriniz=");
        int say3= scan.nextInt();
        System.out.print("Ikinci bir sayi giriniz=");
        int say4= scan.nextInt();
        int kalan1=say3%say4;
        System.out.println(say3+"/"+say4+" isleminden kalan = " + kalan1);

        System.out.print("bir sayi giriniz=");
        int numb1= scan.nextInt();
        System.out.print("ikinci bir sayi giriniz=");
        int numb2= scan.nextInt();
        System.out.println(numb1+"/"+numb2+" isleminden kalan = " + (numb1%numb2));

        System.out.print("bir sayi giriniz=");
        int nu1= scan.nextInt();
        System.out.print("ikinci bir sayi giriniz=");
        int nu2= scan.nextInt();
        System.out.println(nu1+"-"+nu2+" isleminin sonucu = " + (nu1-nu2));

        System.out.print("bir sayi giriniz=");
        int number1= scan.nextInt();
        System.out.print("ikinci bir sayi giriniz=");
        int number2= scan.nextInt();
        System.out.print("ucuncu bir sayi giriniz=");
        int number3= scan.nextInt();
        System.out.print("dorduncu bir sayi giriniz=");
        int number4= scan.nextInt();
        System.out.println(number1+"-"+number2+"-"+number3+"-"+number4+"-"+" = " + (number1-number2-number3-number4));




    }
}
