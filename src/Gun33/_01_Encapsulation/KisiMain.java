package Gun33._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1=new Kisi();
        kisi1.ad="Melih";
        kisi1.soyad="Aydin";
        kisi1.yasAta(-25);
//        kisi1.yas=-25
        int yas=kisi1.yasGetir();

        System.out.println("kisi1 = " + kisi1);
        System.out.println("yas = " + yas);
    }
}
