package Gun27._01_Ornek;

public class Ornek {
    public static void main(String[] args) {
        //1.adim: Person isimli bir class tanimlayiniz: name,surname,age
        //2.adim: main'de 2 tane bu siniftan nesne olusturup deger atayiniz
        //3.adim: bu degerleri yazdiriniz
        //4.adim: getBirthYear isminde person'a ait bir metod yaziniz
        //calistiginda kisinin dogum yilini versin
        //5.adim:getInitials isminde kisinin adinin ilk harfi.soyad ilk harf.
        //seklinde (buyuk harf) veren metodu yaz
        Person kisi1=new Person();
        kisi1.name="Melih";
        kisi1.surname="Aydin";
        kisi1.age=26;

        Person kisi2=new Person();
        kisi2.name="Sebnem";
        kisi2.surname="Metin";
        kisi2.age=26;

        kisi1.BilgiYazdir();
        kisi2.BilgiYazdir();

        kisi1.getBirthYear();
        kisi2.getBirthYear();

        kisi1.getInitials();
        kisi2.getInitials();
    }
}
