package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {
        //Sets: HashSet (hizli)
        //LinkedHashSet(ekleme sirasina gore sirali)
        //TreeSet(her zaman sirali)

        //Hizli calismak icin kendi ozel algoritma sirasina gore saklar
        HashSet<String> hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);// hs=[bes, dort, iki, bir, uc]

        //eklenme sirasina gore elemanlarini tutuyor
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        System.out.println("lhs = " + lhs); // lhs=[bir, iki, uc, dort, bes]

        //alfabetik olarak sirali tutar
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        System.out.println("ts = " + ts); // ts=[bes, bir, dort, iki, uc]

        //sayisal sirayla tutar
        TreeSet<Integer> ts2=new TreeSet<>();
        ts2.add(8);
        ts2.add(4);
        ts2.add(55);
        ts2.add(22);
        ts2.add(1);
        ts2.add(15);
        System.out.println("ts2 = " + ts2);//ts2 = [1, 4, 8, 15, 22, 55]
    }
}
