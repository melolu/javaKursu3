package Gun25;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _01_JavaMap {
    public static void main(String[] args) {
        //Maps= HashMap, LinkedHashMap, TreeMap
        Set<Integer> s=new HashSet<>(); //Set ailesinden HashSet

        Map<Integer, Integer> m=new HashMap<>(); //Map ailesinden HashMap
        //Key'i ve value'si Integer olan bir MAP
        m.put(2,11); //2 anahtarina 11 atadi
        m.put(3,12);
        m.put(6,15);
        m.put(2,5); //2 anahtarindaki degeri guncelledi
        System.out.println("m = " + m); //m = {2=5, 3=12, 6=15}
        System.out.println("m.get(2) = " + m.get(2)); //2 anahtarindaki deger=5
        System.out.println("m.keySet() = " + m.keySet());
        System.out.println("m.values() = " + m.values());

        for(Integer k: m.keySet())
            System.out.println("k = " + k);
        for (Integer v: m.values())
            System.out.println("v = " + v);
        
        for (Map.Entry<Integer,Integer> anahtarValue: m.entrySet()){
            System.out.println("anahtarValue.getKey() = " + anahtarValue.getKey());
            System.out.println("anahtarValue.getValue() = " + anahtarValue.getValue());
        }

        System.out.println("m.containsKey(2) = " + m.containsKey(2));
        System.out.println("m.containsValue(12) = " + m.containsValue(12));

        m.remove(2); // anahtarindaki degeri sil
        System.out.println("m = " + m);

        System.out.println("m.keySet().size() = " + m.keySet().size());

        m.clear();
        System.out.println("m = " + m);

    }
}
