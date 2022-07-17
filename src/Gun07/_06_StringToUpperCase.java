package Gun07;

public class _06_StringToUpperCase {
    public static void main(String[] args) {
        //toUpperCase : stringi buyuk harfe cevirir.

        String text="Merhaba dunya";
        System.out.println("orjinal cumle = " + text);
        System.out.println("cumle komple buyuk = " + text.toUpperCase());
        System.out.println("\"YA\" ile bitiyor mu buyuk kucuk fark etmez = " + text.toUpperCase().endsWith("YA"));
        //text.toUpperCase().endsWith("YA") = once texti komple buyuk yapip sonra YA ile bitiyor mu onu kontrol ediyor.
    }
}
