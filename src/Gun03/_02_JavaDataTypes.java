package Gun03;

import java.io.Console;

public class _02_JavaDataTypes {
    public static void main(String[] args) {
        int sayi;

        byte byteDeger=45;
        short shortDeger=1645;
        int intDeger=25000;
        long longDeger=234567890123L; //tamsayilar default olarak int kabul edilir. long icin sonuna L ekledik

        float floatDeger=3.1234567F; //ondalikli sayilar default olarak double kabul edilir.
                                // bu yuzden sayinin sonuna F ekledik float oldugunu tanimlamak icin
        double doubleDeger=3.123456789012345;

        char basHarf='A';
        char basHarf2=65; // karakter tablosunda a harfine denk gelen 65 sayisini yazinca da cikti alabiliriz
        boolean evetMi= true;

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("basHarf2 = " + basHarf2);
        System.out.println("evetMi = " + evetMi);


    }
}
