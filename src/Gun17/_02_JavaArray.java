package Gun17;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {


        int [] dizi1=new int[5];

        System.out.println("dizi1 = " + dizi1.length);

        Scanner oku=new Scanner(System.in);
        for (int i=0;i< dizi1.length;i++){
            System.out.print("Sayi giriniz=");
            dizi1[i]= oku.nextInt();
        }

        System.out.println("dizi1[2] = " + dizi1[2]);
    }
}
