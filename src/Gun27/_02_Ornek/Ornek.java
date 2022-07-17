package Gun27._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
        // 4-Adim :1 tane nesne'ye deger vererek metodlarin sonuclarini yazdiriniz
        Rectangle dortgen=new Rectangle();
        dortgen.length=12;
        dortgen.width=15;

        dortgen.dortgenAlan();
        dortgen.dortgenCevre();
    }
}
