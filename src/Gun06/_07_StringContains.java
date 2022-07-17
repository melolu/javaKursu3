package Gun06;

public class _07_StringContains {
    public static void main(String[] args) {
        // bir stringin icinde karakter veya karakterlerin var olup olmadigini soyler
        //boolean cinsinden true veya false dondurur.

        String kelime="Merhaba Dunya";

        boolean varMi=kelime.contains("s");
        System.out.println("varMi = " + varMi);
        System.out.println("varMi = " + kelime.contains("a"));
        System.out.println("varMi = " + kelime.contains("haba"));
    }
}
