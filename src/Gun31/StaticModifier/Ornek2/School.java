package Gun31.StaticModifier.Ornek2;

public class School {
    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir id si olmalı.
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

    public static void main(String[] args) {
        Student ogr1=new Student("anil","aydin");
        Student ogr2=new Student("ahmet","aydin");
        Student ogr3=new Student("mehmet","aydin");
        Student ogr4=new Student("ayse","aydin");
        Student ogr5=new Student("melih","aydin");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);
        System.out.println("ogr4 = " + ogr4);
        System.out.println("ogr5 = " + ogr5);
        System.out.println("ogrenci sayisi= " + Student.sayac);

    }
}
