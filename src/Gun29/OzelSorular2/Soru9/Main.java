package Gun29.OzelSorular2.Soru9;

public class Main {
    public static void main(String[] args) {
        int[] arr={1};
        for (int i = 0; i < arr.length; i++) {
            if (arr.length>=1 && arr[0]==arr[arr.length-1])
                System.out.println("true");
            else System.out.println("false");
        }
    }
}
