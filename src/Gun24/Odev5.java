package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class Odev5 {
    //5- rotateList() isminde bir method oluşturun.
    // Parametre olarak String ArrayList
    // ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
    // Tersten yazılmış halini return edin.
    // Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
    // cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>();
        list.add("New Jersey");
        list.add("Atlanta");
        list.add("Ohio");
        list.add("Florida");
        rotateList(list);
        System.out.println(list);
    }
    public static ArrayList<String > rotateList(ArrayList<String > a){
        Collections.reverse(a);
        return a;
    }
}
