package Gun29.OzelSorular2.Soru4;

public class Main {
    public static void main(String[] args) {
        int[] arr1={2,1,10,6};
        int enb=arr1[0];
        int enk=arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (enb<arr1[i]){
                enb=arr1[i];
            }
             if (enk>arr1[i]){
                enk=arr1[i];
            }
        }
        System.out.println("enb-enk = " + (enb - enk));
    }
}
