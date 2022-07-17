package Gun24;

import java.util.LinkedHashSet;

public class Odev14 {
    //14-
    // removing() isminde bir method oluşturun.
    // Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    // Eğer Stringler LinkedHashset 'in içinde varsa, sil.
    // Return tipi linkedhashset
    // Örneğin,
    // linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    // String 1= Germany
    // String 2 = USA
    //**Germany ve USA 'i sil.**
    //**Set'i döndür.**
    public static void main(String[] args) {
        LinkedHashSet<String > ls=new LinkedHashSet<>();
        ls.add("Germany");
        ls.add("France");
        ls.add("USA");
        ls.add("Canada");
        ls.add("Mexico");
        ls.add("Brasil");

        removing(ls,"Germany","USA");
        System.out.println(ls);
    }
    public static LinkedHashSet<String> removing(LinkedHashSet<String> a, String s1,String s2){
        if (a.contains(s1)) a.remove(s1);
        if (a.contains(s2)) a.remove(s2);
        return a;
    }
}
