package Gun29._02_Constructor;

public class Kitapci {
    //book class yaziniz (name,publishYear, author)
    //3 adet constructor ekleyiniz
    //Kitaplarin ozelliklerini tek bir satirda yazdiran bir metod ekleyiniz
    //3 adet kitabi farkli constructor ile olusturup mainde yazdiriniz
    public static void main(String[] args) {

        Book kit1=new Book();
        kit1.name="Ince Mehmet";
        kit1.publishYear=1990;
        kit1.author="Yasar Kemal";

        Book kit2=new Book("Nutuk",1927,"Ataturk");
        Book kit3=new Book("Nutuk",1927);

        kit1.yazdir();
        kit2.yazdir();
        kit3.yazdir();

        System.out.println(kit1);
        //zaten her zaman ekrana yazacagi zaman toString yapar bu yuzden
        //toString methodu ile yazdirabiliriz
        //aksi halde zaten yazdirma islemi yapmaz hata verir
    }

}
