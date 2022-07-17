package Gun29.OzelSorular2.Soru5;

public class Main {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{2,3,1},{5,5,5},{2,10,3}};
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        System.out.println("max = " + max);
    }
}
