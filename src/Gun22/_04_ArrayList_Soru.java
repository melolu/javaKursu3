package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04_ArrayList_Soru {
    public static void main(String[] args) {
        //kullanicidan alacaginiz 6 elemanli bir dizinin sadece tek elemanlarini ayri diziye atayarak yazdiriniz

        int[] dizi1=new int[6];
        ArrayList<Integer> dizi2=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < dizi1.length; i++) {
            System.out.print("bir sayi girin=");
            dizi1[i]= sc.nextInt();

        }

        for (int i = 0; i < dizi1.length; i++) {
                if (dizi1[i]%2==1)
                    dizi2.add(dizi1[i]);
        }
        System.out.println("dizi1="+Arrays.toString(dizi1));
        System.out.println("teklerden olusan dizi = " + dizi2);

        //Odev= tek elemanlarini ayri diziye bir metodda atayarak main de yazdiriniz
        ArrayList<Integer> donenTekler=tekElemanlariAta(dizi1);
        System.out.println("donenTekler = " + donenTekler);
    }

    public static ArrayList<Integer> tekElemanlariAta(int[] dizi){
        ArrayList<Integer> dizi2=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1)
                dizi2.add(dizi[i]);
        }
        return dizi2;
    }
}
