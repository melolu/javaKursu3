package Gun28._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders Class : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
    // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini
    //    tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
    // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
    //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
    //    uyarı versi, alabileceğiniz max credi doldu şeklinde.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        Ders lesson1 = new Ders();
        lesson1.name = "Matematik";
        lesson1.credit = 4;


        Ders lesson2= new Ders();
        lesson2.name="Turkce";
        lesson2.credit=5;


        Ders lesson3=new Ders();
        lesson3.name="Fizik";
        lesson3.credit=6;


        Ogrenci student=new Ogrenci();
        student.name="melih aydin";
        student.maxCredit=10;



        student.dersEkle(lesson3);
        student.dersEkle(lesson2);
        student.dersEkle(lesson1);




    }
}
