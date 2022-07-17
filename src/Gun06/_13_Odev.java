package Gun06;

import java.util.Scanner;

public class _13_Odev {
    public static void main(String[] args) {
        String cumle="I love Java";
        System.out.println("uzunluk(\"I love Java\") = " + cumle.length());

        String dizi="Sprint planning";
        System.out.println("dizinin uzunlugu(\"Sprint planning\") = " + dizi.length());

        String elma="apple";
        System.out.println("icersinde var mi?(\"app\") = " + elma.contains("app"));

        String portakal="orange";
        System.out.println("\"orange\"esit mi?(\"apple\") = " + portakal.equals("Apple"));

        String elma2="apple";
        System.out.println("\"apple\"esit mi?(\"apple\") = " + elma2.equalsIgnoreCase("apple"));

        String state="Florida";
        System.out.println("harfin bulundugu index(\"o\") = " + state.indexOf("o"));

        String cumle2="Thank you";
        System.out.println("harfin bulundugu konum(\"y\") = " + cumle2.indexOf("y"));

        String fare="Mouse";
        System.out.println("fare = " + fare.charAt(3));

        Scanner oku=new Scanner(System.in);
        System.out.print("Lutfen iki adinizi ve soyadinizi girin=");
        String isim= oku.nextLine();
        char ilkAdinIlkHarfi=isim.charAt(0);
        int boslukIndex=isim.indexOf(" ");
        char ikinciAdinIlkHarfi=isim.charAt(boslukIndex+1);
        int ikinciBoslukIndex=isim.indexOf(" ",boslukIndex+1);
        char soyadIlkHarf=isim.charAt(ikinciBoslukIndex+1);
        System.out.println("isim kisaltmasi= " + ilkAdinIlkHarfi+"."+ikinciAdinIlkHarfi+"."+soyadIlkHarf);

    }
}
