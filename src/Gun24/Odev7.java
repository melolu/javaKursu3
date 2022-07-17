package Gun24;

import java.util.ArrayList;

public class Odev7 {
    //7-
    //common_values() isminde bir method oluşturun.
    //Parametre olarak 2 tane Integer ArrayList
    //Return tipi integer ArrayList olmalı
    //İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
    //Örn;ArrayList 1:    3 , 2 , 5 , 6
    //ArrayList 2:     5 , 8 , 9
    //return  5 olmalı
    //Örn;ArrayList 1: 8,7,9,6,7
    //ArrayList 2: 6,7,12,3,1
    //return 6 ve 7 olmalı
    public static void main(String[] args) {
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(3);
        arr1.add(2);
        arr1.add(5);
        arr1.add(6);

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(5);
        arr2.add(8);
        arr2.add(9);



        System.out.println(common_values(arr1,arr2));
    }
    public static ArrayList<Integer> common_values(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (a.get(i)==b.get(j)){
                    c.add(a.get(i));
                }
            }
        }
        return c;
    }
}
