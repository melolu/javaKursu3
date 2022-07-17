package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {

        String girilenKelime="65"; //bu haliyle ahmet kelimesinden farksiz toplama yapilamaz
        System.out.println("girilenKelime = " + girilenKelime);

        //kelimenin sayiya cevrilmesi
        int intDeger=Integer.parseInt(girilenKelime);
        double doubleHali=Double.parseDouble(girilenKelime);

        System.out.println("intDeger = " + intDeger);
        System.out.println("doubleHali = " + doubleHali);


        /* rakami yaziya cevirmek isteyelim */
        // hava sicakligini rakam olarak tanimlayiniz ve bir cumle seklinde 'bugun hava 12 derece' yazdiriniz,

        int sicaklik=12;
        System.out.println("Bugun hava "+sicaklik+" derecedir.");


        String sicaklikKelimeHali= Integer.toString(sicaklik);

        System.out.println("Bugun hava "+sicaklikKelimeHali+" derecedir.");
    }
}
