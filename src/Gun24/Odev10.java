package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class Odev10 {
    //10-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    //Store all the elements in one arraylist and print the arraylist
    //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    //**Örnek:**
    //**Girdi:**
    //[
    // [ 1, 2, 3 ],
    // [ 4, 5, 6 ],
    // [ 7, 8, 9 ]
    //              ]
    //**Çıktı:** [1,2,3,4,5,6,7,8,9]
    public static void main(String[] args) {
    int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.add(arr[i][j]);
            }
        }
        System.out.println(list);
    }
}
