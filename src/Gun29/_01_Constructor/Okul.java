package Gun29._01_Constructor;

public class Okul {
    // bir student sinifi olusturunuz (id, name, surName, classroom(int)) ve
    // bundan 7 adet ogrenci olusturunuz
    public static void main(String[] args) {
        //1.yontem

        Student ogr1=new Student();
        ogr1.id=1;
        ogr1.name="Melih";
        ogr1.surName="Aydin";
        ogr1.classroom=12;
        System.out.println("ogr1.name = " + ogr1.name);

        Student ogr2=new Student();
        ogr2.id=2;
        ogr2.name="Sebnem";
        ogr2.surName="Metin";
        ogr2.classroom=10;
        System.out.println("ogr2.name = " + ogr2.name);

        //2.yontem

        Student ogr3=new Student(3,"Anil","Ayydin",8);
        System.out.println("ogr3.name = " + ogr3.name);

        Student ogr4=new Student(4,"Anil","Ayydin",8);
        Student ogr5=new Student(5,"Anil","Ayydin");
        Student ogr6=new Student(6,"Anil");
        Student ogr7=new Student(7);



    }
}
