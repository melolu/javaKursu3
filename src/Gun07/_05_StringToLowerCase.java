package Gun07;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
        //toLowerCase : stringi kucuk harfe cevirir.
        String text="Merhaba Dunya";

        System.out.println("orjinal hali = " + text);
        System.out.println("kucuk hali = " + text.toLowerCase());
        System.out.println("buyuk hali = " + text.toUpperCase());
        System.out.println("text buyuk veya kucuk harf de olsa \"me\" ile basliyor mu? = " + text.toLowerCase().startsWith("me"));
        //text.toLowerCase().startWith("me") == once komple kucuk harf yapip sonra me ile bitiyor mu kontrol ediyor
    }
}
