package Gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Odev8 {
    //8-
    // secondMax()  isminde bir method oluşturun.
    // Parametre olarak integer ArrayList.
    // Return tipi int olmalı.
    // ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
    // **ÖRN;**
    // ArrayList   --  5,3,4,6,7
    // CEVAP : 6
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(15);
        System.out.println(secondMax(list));
    }
    public static int secondMax(ArrayList<Integer> a){
        int enb2=a.get(0);
        int enb=a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)>enb){
                enb2=enb;
                enb=a.get(i);
            } else if (a.get(i)>enb2) {
                enb2=a.get(i);
            }
        }
        return enb2;
    }
}
