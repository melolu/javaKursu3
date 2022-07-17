package Gun29.OzelSorular2.Soru3;

public class Main {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={7,3,2};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[0]==b[0] || a[a.length-1]==b[b.length-1]){
                    System.out.println("true");
                }
                else System.out.println("false");
            }
        }
    }
}
