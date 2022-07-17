package Gun29._03_Constructor;

public class Bankalar {
    //Bir banka class tanimlayin
    //3 adet field ekleyin (adi, subeSayisi, kurulusYili)
    //3 adet constructor ekleyin
    //toString metodu olusturun
    //3 tane nesne olusturup mainde yazdiriniz
    public static void main(String[] args) {
        Banka bnk1=new Banka("Garanti",45,1980);
        Banka bnk2=new Banka("Ziraat",4);
        Banka bnk3=new Banka();
        bnk3.adi="Vakifbank";
        bnk3.subeSayisi=5;
        bnk3.kurulusYili=1925;

        System.out.println("bnk1 = " + bnk1);
        System.out.println("bnk2 = " + bnk2);
        System.out.println("bnk3 = " + bnk3);
    }
}
