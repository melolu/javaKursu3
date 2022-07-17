package Gun07;

public class _09_StringReplaceAll {
    public static void main(String[] args) {
        // replaceAll : replace gibi calisiyor farki kriter(Regex)
        //regex: regular expression / duzenli ifade
        // TODO (yapilacak) : regex olarak neler yazilabilir googledan aratirilacak

        String text="Merhaba Dunya";
        System.out.println("text = " + text);
        //a,b,n karakterlerini ayri ayri bul ve _ ile degistir
        System.out.println("a,b,n karakterleri _ olsun = " + text.replaceAll("[abn]","_"));
        //buyuk harfleri _ ile degistir
        System.out.println("buyuk harfler _ olsun = " + text.replaceAll("[A-Z]","_"));
    }
}
