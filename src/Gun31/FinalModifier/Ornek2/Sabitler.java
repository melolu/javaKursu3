package Gun31.FinalModifier.Ornek2;

public class Sabitler {
    final static int saat=24;
    final static int dakika=60;
    final static int saniye=60;

    public static int hesapla(int gun, int saat, int dakika){
        int toplamSaniye=gun*Sabitler.saat*Sabitler.dakika*Sabitler.saniye
                +saat*Sabitler.dakika*Sabitler.saniye
                +dakika*Sabitler.saniye;
        return toplamSaniye;
    }
}
