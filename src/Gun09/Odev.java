package Gun09;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        /*int num1=25, num2=5; //1
        int bolme=num1/num2;
        System.out.println("25/5 = " + bolme);

        int num3=16, num4=4; //2
        int sonuc=num3/num4;
        System.out.println("16/4 = " + sonuc);

        double num5=4.5, num6=3.5, num7=5.5; //3
        double sonuc1=num5*num6*num7;
        System.out.println("4.5 * 3.5 * 5.5 = " + sonuc1);

        double d1=4.5, d2=2.2, d3=1.8, d4=4.4; //4
        double sonuc2=d1*d2*d3*d4;
        System.out.println("4.5 * 2.2 * 1.8 * 4.4 = " + sonuc2);

        int num8=2, num9=7, num11=4, num12=3; //5
        int sonuc3=num8*num9*num11*num12;
        System.out.println("2 * 7 * 4 * 3 = " + sonuc3);

        int num13=16, num14=10; //6
        int sonuc4=num13%num14;
        System.out.println("16/10 isleminden kalan= " + sonuc4);

        int num15=24, num16=9; //7
        int sonuc5=num15%num16;
        System.out.println("24/9 isleminden kalan= " + sonuc5);

        int num17=30, num18=4; //8
        int sonuc6=num17%num18;
        System.out.println("30/4 isleminden kalan = " + sonuc6);

        int num19=21, num21=13; //9
        int sonuc7=num19-num21;
        System.out.println("21-13= " + sonuc7);

        int num22=80, num23=15, num24=24, num25=17; //10
        int sonuc8=num22-num23-num24-num25;
        System.out.println("80-15-24-17 = " + sonuc8);*/

        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();
        System.out.println("sayinin birler basamagi = " + sayi%10);
        System.out.println("sayinin onlar basamagi = " + (sayi/10)%10);
        System.out.println("sayinin yuzler basamagi = " + (sayi/100%10));

        System.out.print("vize notunuzu giriniz=");
        int vize=scan.nextInt();
        System.out.print("final notunuzu giriniz=");
        int ffinal=scan.nextInt();
        double ortalama=0.4*vize+0.6*ffinal;
        System.out.println("ortalama = " + ortalama);




    }
}
