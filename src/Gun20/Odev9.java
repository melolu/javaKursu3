package Gun20;

import java.util.ArrayList;

public class Odev9 {
    //9-append adında bir method oluşturun.
    // Parametre olarak iki int array  oluşturun ve ikinci array'in değerlerini
    // ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
    // Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
    // Bunu döndürmelidir:{2, 4, 6, 1, 2, 3, 4, 5}.


    public static void main(String[] args) {
        int[] arr1={2,4,6};
        int[] arr2={1,2,3,4,5};
        append(arr1,arr2);

    }
    static public void append(int[] a, int[] b){
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            arrayList.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            arrayList.add(b[i]);
        }
        System.out.println("arrayList = " + arrayList);
    }
}
