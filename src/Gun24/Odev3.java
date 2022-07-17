package Gun24;

import java.util.ArrayList;

public class Odev3 {
    //3-
    // getLength() isminde bir method oluşturun.
    // Parametre olarak String ArrayList
    // Return tipi Integer ArrayList
    // ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
    // Tüm elementlerin uzunluğunu döndürün
    // Örneğin;
    // ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
    // Tüm Stringlerin uzunluklarını yazdırın;
    // cevap: 10 ,  8 , 4 , 7 , 6 olmalı
    public static void main(String[] args) {
        ArrayList<String> sehir=new ArrayList<>();
        sehir.add("New Jersey");
        sehir.add("New York");
        sehir.add("Ohio");
        sehir.add("Florida");
        sehir.add("Boston");
        System.out.println(getLength(sehir));

    }
    public static ArrayList<Integer> getLength(ArrayList<String> a){
        ArrayList<Integer> uzunluk=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            uzunluk.add(a.get(i).length());
        }
        return uzunluk;
    }
}
