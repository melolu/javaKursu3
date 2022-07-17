package Gun19;

import java.util.Scanner;

public class OzelSoru1 {
    public static void main(String[] args) {
        //1- Kullanıcıdan yaş bilgisini isteyiniz
        //Eğer yaş 10 dan küçük veya eşit ise
        //"facebook hesabi acmak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 16 dan küçük veya eşit ise
        //"ehliyet almak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 18 den küçük veya eşit ise
        //"dovme yaptirmak icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 21 den küçük veya eşit ise
        //"alkol icmek icin cok gencsin" şeklinde yazdırın
        //Eğer yaş 21 den büyük ise
        //"istediğini yapabilirsin" şeklinde yazdırın

        Scanner sc=new Scanner(System.in);
        System.out.print("Yasinizi giriniz=");
        int yas= sc.nextInt();
        if (yas<=10)
            System.out.println("Facebook hesabi acmak icin cok gencsin");
        else if (yas<=16)
            System.out.println("ehliyet almak icin cok gencsin");
        else if (yas <=18)
            System.out.println("Dovme yaptirmak icin cok gencsin");
        else if (yas<=21)
            System.out.println("Alkol icmek icin cok gencsin");
        else System.out.println("Istedigini yapabilirsin");
    }
}
