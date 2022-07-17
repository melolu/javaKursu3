package Gun07;

public class _03_StringEndsWith {
    public static void main(String[] args) {
        // endsWith ...... ile bitiyor mu? sonuc boolean cikar

        String text="Merhaba dunya";
        System.out.println("text = " + text.endsWith("ya")); //true
        System.out.println("text = " + text.endsWith("ba")); //false
    }
}
