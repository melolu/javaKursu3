package Gun24;

import java.util.ArrayList;

public class Odev6 {
    //6-hillNum() isminde bir method oluşturun.
    // Parametre olarak Integer ArrayList
    // Return tipi int
    // Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    // Örneğin; ArrayList  5,4,6,2,1
    // 2, 6'dan küçük ve 1 den büyüktür.
    // Return 2 olmalı.
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(1);
        hillNum(list);
        System.out.println("return="+hillNum(list));
    }
    public static int hillNum(ArrayList<Integer> a){
        int sayi= a.get(0);
        for (int i = 1; i < a.size()-1; i++) {
            if (a.get(i)<a.get(i-1) && a.get(i)>a.get(i+1))
                sayi=a.get(i);

        }
        return sayi;
    }
}
