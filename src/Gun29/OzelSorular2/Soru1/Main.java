package Gun29.OzelSorular2.Soru1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] dizi1={1,2,3,2,3};


        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for (int i = 0; i < 3;i++) {
            al1.add(dizi1[i]);
        }
        for (int i = 3; i < dizi1.length; i++) {
            al2.add(dizi1[i]);
        }
        for (Integer i:al1){
            System.out.println("i = " + i);
        }
        for (Integer i2:al2){
            System.out.println("i2 = " + i2);
        }
//     for (int i = 0; i < al2.size(); i++) {
//         for (int j = 0; j < al1.size(); j++) {
//             if (al1.get(j)== al2.get(i)){
//                 System.out.print("true");
//             }
//             else System.out.print("false");
//         }
//     }
     }
}
