package Gun19;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 100 elemanli bir diziyi random (0-100) doldurduktan sonra sadece tek elemanlarinizi
        //bir baska diziye atayiniz

        int[] arr1 = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        int sayac = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1) {
                sayac++;
            }
        }
        int[] arr2 = new int[sayac];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 1) {
                arr2[index] = arr1[i];
                index++;
            }
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }
}
