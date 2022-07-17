package Gun29.OzelSorular2.Soru6;

public class Main {
    public static void main(String[] args) {
        int[][] arr={{2,1,3}, {2,3,5} , {5,5,5} , {7,3,6}};
        int min=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]<min)
                    min=arr[i][j];
            }
        }
        System.out.println("min = " + min);
    }
}
