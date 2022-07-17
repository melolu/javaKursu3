package Gun29.OzelSorular2.Soru2;

public class Main {
    public static void main(String[] args) {
        String[] arr={"Orange","Peach","Berry","Watermelon","Orange"};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Orange")){
                arr[i]=arr[i].replace("Orange","Apple");
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr = " + arr[i]);
        }
    }
}
