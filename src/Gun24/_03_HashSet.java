package Gun24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<String > renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");//bunu eklemez
        renkler.add("RED");//bunu ekler

        //ekrana yazdirma 1.yontem
        System.out.println("renkler = " + renkler);

        //ekrana tek tek yazdirma 2.yontem
        for (String s : renkler) { //renklerin icindeki elemanlari herhangi bir sirayla s ismini vererek gonderiyor
            System.out.println("s = " + s);
        }

        //ben bunlari kendi icinde sirali olanlarin sirasina gore nasil yazdirabilirim. TreeSet ve LinkedSet
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        for (String s: ts) {//sirayi garanti etmiyor
            System.out.println("ts= " + s);
        }
        Iterator gosterge= ts.iterator(); //indexin yaptigini yapiyor
        while (gosterge.hasNext()) //setlerde kendi icindeki sirasina gore elemanlara ulasmak icin
        {
            System.out.println("gosterge = " + gosterge.next());
        }

    }


}
