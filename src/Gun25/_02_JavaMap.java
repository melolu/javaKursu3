package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        //bir kartvizit uygulamasini 2 kisi icin yapiniz
        Map<String,String > sKartvizit=new HashMap<>();
        sKartvizit.put("isim","Melih");
        sKartvizit.put("email","melih@gmail.com");
        sKartvizit.put("adres","Turkiye");
        sKartvizit.put("telefon","112");

        System.out.println("sKartvizit.get(\"isim\") = " + sKartvizit.get("isim"));
        System.out.println("sKartvizit.get(\"telefon\") = " + sKartvizit.get("telefon"));


        Map<String,String > iKartvizit=new HashMap<>();
        iKartvizit.put("isim","Anil");
        iKartvizit.put("email","anil@gmail.com");
        iKartvizit.put("adres","USA");
        iKartvizit.put("telefon","155");

        Map<String,Map<String,String >> kartDefteri=new HashMap<>();
        kartDefteri.put("Melih",sKartvizit);
        kartDefteri.put("Anil", iKartvizit);

        kartDefteri.get("Anil").get("telefon");
        System.out.println("Anil'in telefonu= " + kartDefteri.get("Anil").get("telefon"));
        
        for (Map.Entry<String, Map<String,String>> kartVizit : kartDefteri.entrySet())
            System.out.println("kartVizit = " + kartVizit);

    }
}
