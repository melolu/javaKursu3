package Gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class Odev13 {
    //13-
    //commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
    //return tipi arraylist olmalı.
    //**ÖRNEĞİN:**
    //İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
    //İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
    //Ortak değerleri ArrayListe ekleyiniz.
    //çıktı:  "Germany" , "Brazil" ,"USA"
    //ArrayListi yazdırınız.
    public static void main(String[] args) {
        HashSet<String> hs1=new HashSet<>();
        hs1.add("Germany");
        hs1.add("England");
        hs1.add("South Africa");
        hs1.add("Brasil");
        hs1.add("USA");
        HashSet<String> hs2=new HashSet<>();
        hs2.add("Germany");
        hs2.add("China");
        hs2.add("Brasil");
        hs2.add("France");
        hs2.add("USA");

        System.out.println("ortaklar="+commonValues(hs1,hs2));
    }
    public static ArrayList<String> commonValues(HashSet<String > a, HashSet<String > b){
        ArrayList<String> c=new ArrayList<>();
        c.addAll(a);
        c.retainAll(b);
        return c;
    }
}
