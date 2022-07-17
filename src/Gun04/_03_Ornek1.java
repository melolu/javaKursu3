package Gun04;

public class _03_Ornek1 {
    public static void main(String[] args) {
        // 3 farkli (char,int,boolean) tipde degisken tanimlayiniz.
        // deger atayiniz ve ekrana yazdiriniz.
        char subeAdi='C';
        int sinif=10;
        boolean gectiMi=true;
        String subeAdi2="C";

        System.out.println("sinif = " + sinif);
        System.out.println("subeAdi = " + subeAdi);
        System.out.println("gectiMi = " + gectiMi);

        System.out.println(sinif+""+subeAdi+":"+gectiMi);
        //toplamada aralarinda bir tane string ifade varsa toplama islemi yan yana birlestirme islemine donusur.
        System.out.println(sinif+subeAdi2+":"+gectiMi);
    }
}
