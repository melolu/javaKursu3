package Gun07;

public class _10_StringReplaceFirst {
    public static void main(String[] args) {
        //replaceFirst: replace ile ayni sadece ilk bulunani degistirir

        String text="Merhaba Dunya";
        System.out.println("orjinal hali = " + text);
        System.out.println("butun a harfleri degissin = " + text.replace("a","_"));
        System.out.println("buldugu ilk a harfini degissin = " + text.replaceFirst("a","_"));
    }
}
