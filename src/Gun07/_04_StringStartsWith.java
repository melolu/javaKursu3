package Gun07;

public class _04_StringStartsWith {
    public static void main(String[] args) {
        // startsWith bir stringin verilen string ile baslayip baslamadiginin sonucunu boolean olarak verir
        String text="HCL Teknoloji";
        System.out.println("HC ile basliyor mu? = " + text.startsWith("HC")); //true
        System.out.println("Me ile basliyor mu? = " + text.startsWith("Me")); //false
        System.out.println("h ile basliyor mu? = " + text.startsWith("h")); //false

    }
}
