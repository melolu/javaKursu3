package Gun05;

import java.util.Scanner;

public class _10_Ornek {
    public static void main(String[] args) {
        // kullanicidan kac bilet istedigini (byte) ve sigorta isteyip istemedigini (boolean) olarak alip ekrana yazdirin
        Scanner oku=new Scanner(System.in);
        System.out.print("Kac bilet istiyorsunuz?");
        byte bilet= oku.nextByte();
        System.out.println("Sigorta istiyor musunuz?");
        boolean sigorta=oku.nextBoolean();
        System.out.println(bilet+" "+"adet bilet istiyor. Sigorta durumu:"+ sigorta);
    }
}
