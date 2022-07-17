package Gun24;

import java.util.HashSet;

public class Odev12 {
    //12-changeSet() isminde bir method oluşturun.
    // Parametre olarak bir String HashSet   ve  iki String
    //return hashset olmalı
    // Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
    // **ÖRNEK:**//hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    // String 1 = **banana**
    // String 2 = **peach**
    // **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("banana");
        hs.add("strawberry");
        hs.add("kiwi");
        hs.add("pineappe");
        changeSet(hs,"banana","peach");
        System.out.println(hs);


    }
    public static HashSet<String> changeSet(HashSet<String> a,String s1,String s2){
        if (a.contains(s1)){
            a.remove(s1);
            a.add(s2);
        }
        return a;
    }
}
