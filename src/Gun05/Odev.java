package Gun05;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        Scanner oku2=new Scanner(System.in);
        //1 Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        System.out.print("Isim giriniz=");
        String isim= oku.nextLine();
        System.out.println("\t isim = " + isim);

        //2 Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        System.out.print("herhangi bir sayi giriniz=");
        int sayi= oku2.nextInt();
        System.out.println("\t sayi = " + sayi);

        //3 Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        System.out.print("Sevdiginiz meyveyi yaziniz:");
        String meyve= oku.next();
        System.out.println("\t meyve = " + meyve);

        //4 Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        System.out.print("Arabanizdaki kapi sayisini giriniz=");
        int kapiSayisi= oku2.nextInt();
        System.out.println("\t Kapi Sayisi = " + kapiSayisi);

        //5 Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        System.out.print("10 sene once yasadiginiz sehir neresidir? ");
        String sehir= oku.next();
        System.out.println("\t sehir = " + sehir);

        //6 Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        System.out.print("Lutfen dogum gununuzu gun/ay/yil seklinde giriniz: ");
        String dogumGunu= oku.next();
        System.out.println("\t Dogum Gunu = " + dogumGunu);

        //7 Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız. Varsa True ,
        // yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        System.out.print("Bir banka hesabiniz var mi?(True/False) =");
        boolean varMi=oku.nextBoolean();
        System.out.println("\t cevap = " + varMi);

        //8 Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        System.out.print("Kilogram cinsinden bir agirlik giriniz=");
        byte agirlik= oku.nextByte();
        System.out.println("\t agirlik = " + agirlik+" kg");

        //9 Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.
        System.out.print("Boyunuzu metre cinsinden giriniz=");
        float boy= oku.nextFloat();
        System.out.println("\t boy = " + boy+" m");
    }
}
