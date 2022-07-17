package Gun33._03_Encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
    //  3- Bütün fieldlar için encapsulation uygulayınız.
    //  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarı kadar
    //     kullanicidan alarak öğrenci
    //     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine
    //     başka öğrenci isteyiniz.
    //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.

    public static void main(String[] args) {
        Okul okul1=new Okul("omu",3);
        Scanner sc=new Scanner(System.in);
        Scanner scInt=new Scanner(System.in);

        do {
            System.out.print("Ogrenci adi=");
            String ad=sc.nextLine();

            System.out.print("Ogrenci soyadi=");
            String soyad=sc.nextLine();

            System.out.print("Ogrenci yasi=");
            int yas=scInt.nextInt();

            if (yas<=15){
                Ogrenci ogr=new Ogrenci(ad,soyad,yas);
                okul1.Ogrenciler.add(ogr);
            }
            else System.out.println("Yas siniri asildi");

            System.out.println("ogrenciler = " + okul1.Ogrenciler);

        }while (okul1.getMaxOgrenciSayisi()>okul1.Ogrenciler.size());
    }
}
