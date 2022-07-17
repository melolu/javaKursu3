package Gun24;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {
        int sayi=5; //hafizada bir sayi tutar
        int[] dizi=new int[5]; //hafizada 5 sayi tutuyor
        int[][] tablo=new int[3][4]; // 12 adet sayi tutuyor

        ArrayList<Integer> liste=new ArrayList<>();//boyu eklendikce artan dinamik dizi
        ArrayList<ArrayList<Integer>> listelerinListesi=new ArrayList<>();// dinamik 2 boyutlu

        //bana artik elemanlari gelisiguzel miktarinca tutan degil, ayni elemanlari tutmayan, yani 1 elemandan
        //sadece 1 tane olan diziler lazim. hangi sirada oldugunun bir onemi yok
        //bunlara set denir: LINKEDHASHSET(EKLENME SIRASINA GORE), TREESET(SIRALI),HASHSET(HIZLI)

        HashSet<Integer> hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(7);
        hs1.add(36);
        hs1.add(2);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        boolean eklendiMi=hs1.add(5);
        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println("hs1="+hs1);
    }
}
