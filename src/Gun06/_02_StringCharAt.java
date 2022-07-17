package Gun06;

public class _02_StringCharAt {
    public static void main(String[] args) {
        //istenen noktadaki karakteri verir
        //karakterin sirasi 0'dan baslar, buna index denir.
        //             0123456789012
        String kelime="Merhaba Dunya";

        System.out.println("3.harf(index)= " + kelime.charAt(3));

        char ilkHarf=kelime.charAt(0);

        System.out.println("ilkHarf = " + ilkHarf);

    }
}
