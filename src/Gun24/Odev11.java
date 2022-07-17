package Gun24;

import java.util.HashSet;

public class Odev11 {
    //11-
    // Create a method totalCount()
    // totalCount() isminde bir method oluşturun.
    // Parametresi  'Integer Hashset' olmalı
    // HashSetteki eleman sayısını alın.
    // totalCount'u döndürün.
    // _**Örnek:**_
    // hashset ; 4,2,3,1,7
    // cevap: 5
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(4);
        hs.add(3);
        hs.add(2);
        hs.add(1);
        hs.add(7);
        totalCount(hs);
    }
    public static void totalCount(HashSet<Integer > a){
        System.out.println("total count="+a.size());
    }
}
