package Gun06;

public class _04_StringIndexOf {
    public static void main(String[] args) {
        //verilen karakter veya karakterlerin stringin icindeki INDEX'ini verir
        // Merhaba kelimesindeki r harfinin indexini bulmak istersek kelime.IndexOf("r") dersek 2 sonucunu aliriz
        // Merhaba kelimesindeki ha'nin indexini bulmak icin kelime.IndexOf("ha") dersek 3 sonucunu aliriz
        // Merhaba kelimesindeki a'nin indexi icin kelime.IndexOf("a") dersek ilk gordugu a harfinin indexini verir
        // eger bulamazsa -1 gonderir. bunun anlami bulunamadi demektir
        
        String kelime="Merhaba Dunya";
        System.out.println("kelime= " + kelime.indexOf("r"));
        System.out.println("kelime= " + kelime.indexOf("ha"));
        System.out.println("kelime= " + kelime.indexOf("a"));
        System.out.println("kelime= " + kelime.indexOf("ny"));
        System.out.println("kelime= " + kelime.indexOf(" "));
        System.out.println("kelime= " + kelime.indexOf("A"));
        System.out.println("kelime= " + kelime.indexOf("a",7));//a yi ara ama 7.indeksten sonrakilerde ara
    }
}
