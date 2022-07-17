package Gun07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // bir stringin icindeki istenen karakterlerin hepsini veirlen yenisi ile degistirir
        String text="Merhaba Dunya";

        System.out.println("orjinali = " + text);
        System.out.println("a larin e olarak degismis hali=" + text.replace("a","e"));
        System.out.println("ba de oldu= " + text.replace("ba","de"));
        System.out.println("dunya java oldu= " + text.replace("Dunya","Java"));
        System.out.println("a lar silindi = " + text.replace("a",""));
    }
}
