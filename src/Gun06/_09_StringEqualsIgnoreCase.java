package Gun06;

public class _09_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        //equal ile ayni calisir, buyuk kucuk harf ayirimi yapmaz
        String s1="Merhaba";
        String s2="MerHaBa";

        System.out.println("s2 = " + s2.equalsIgnoreCase(s1));
    }
}
