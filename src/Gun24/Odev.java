package Gun24;

import java.util.ArrayList;

public class Odev {
    //1-ismi getCount() olan bir method oluşturun.
    // Parametre olarak bir String ArayList  ve  bir tane StringReturn tipi int olmalı.
    // ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
    // Örneğin; ArrayList = Orange , Kiwi , Peach , Banana , Orange
    // String Orange: Count = 2 olmalı. (Orange 2 kez yazılmış)
    public static void main(String[] args) {
        ArrayList<String > arr=new ArrayList<>();
        arr.add("Orange");
        arr.add("Kiwi");
        arr.add("Peach");
        arr.add("Banana");
        arr.add("Orange");
        arr.add("Tomato");
        arr.add("Orange");
        arr.add("Orange");
        arr.add("Pineapple");
        System.out.println("count="+getCount(arr,"Orange"));
    }
    public static int getCount(ArrayList<String> a,String s1){
        int sayac=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).contains(s1)) sayac++;
        }
        return sayac;
    }
}
