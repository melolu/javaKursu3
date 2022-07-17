package Gun24;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev2 {
    //2-getSum() isminde bir method oluşturun.Parametresi ArrayList olmalı
    // Return tipi int olmalı.ArrayList teki tüm sayıları birbiri ile toplayın.
    // return olarak toplam sonucu döndürün.
    // Örneğin;Arraylist = 1,2,3,4,5return 15 olmalı
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(6);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(15);
        System.out.println(getSum(arrayList));
    }
    public static int getSum(ArrayList<Integer> a){
        int toplam=0;
        for (int i = 0; i < a.size(); i++) {
            toplam+=a.get(i);
        }
        return toplam;
    }
}
