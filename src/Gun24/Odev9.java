package Gun24;

import java.util.ArrayList;

public class Odev9 {
    //9-
    //rangeBtw() isminde bir method oluşturun.
    //Parametre olarak   **bir Arraylist**  ve **iki ayrı int**
    //return tipi int
    //Arraylist'in **iki int arasında kaç değeri olduğunu** sayın.
    //return  **count**       (sayacı (count) döndürün.)
    //**Example (Örnek):**
    //ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    //min = 20
    //max = 30
    //return =  5    (20,22,25,28,30)
    //min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(22);
        list.add(10);
        list.add(20);
        list.add(14);
        list.add(8);
        list.add(25);
        list.add(30);
        list.add(28);
        System.out.println("return="+rangeBtw(list,20,30));

    }
    public static int rangeBtw(ArrayList<Integer> a, int i1, int i2){
        int sayac=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i)>=i1 && a.get(i)<=i2)
                sayac++;
        }
        return sayac;
    }
}
