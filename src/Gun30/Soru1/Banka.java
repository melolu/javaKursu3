package Gun30.Soru1;

public class Banka {
    //musteri   (hesapID, ad,soyad, MusteriHesap(Hesap tipinde))
    //Hesap (yatan,cekilen,bakiye(direk erisim olmamali))
    //bir banka uygulamasi icin 1 musteri tanimlayiniz
    //musterinin hesabina sirasiyla 100tl, 200tl, yatiriniz
    //sonra 50 tl cekiniz. Musterinin kalan bakiyesini yazdiriniz
    //bakiyeye direk para atanamadigini kontrol ediniz
    public static void main(String[] args) {
        Musteri musteri1=new Musteri();
        musteri1.hesapID=1;
        musteri1.ad="Melih";
        musteri1.soyad="Aydin";
        musteri1.musteriHesabi= new Hesap();

        musteri1.musteriHesabi.paraYatir(100);
        musteri1.musteriHesabi.paraYatir(200);
        musteri1.musteriHesabi.paraCek(50);


        System.out.println("Ekstre = " + musteri1.musteriHesabi);
    }
}
