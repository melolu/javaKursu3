package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class Odev4 {
    //4-İsmi changelnArraylist() olan bir method oluşturun.
    // Parametre olarak String ArrayList, String s1, String s2
    //Arraylist'te s1'i s2 olarak değiştirin
    //Return String arrayList
    //Örneğin;Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
    //s1 = blue s2 = yellow
    //Tüm blue 'ları yellow'a dönüştürün.
    //cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
    public static void main(String[] args) {
        ArrayList<String > arr=new ArrayList<>();
        arr.add("yellow");
        arr.add("red");
        arr.add("blue");
        arr.add("red");
        arr.add("blue");
        changelnArraylist(arr,"blue","yellow");
        System.out.println(arr);


    }
    public static ArrayList<String > changelnArraylist(ArrayList<String > a,String s1,String s2){
        Collections.replaceAll(a,s1,s2);
        return a;
    }
}
