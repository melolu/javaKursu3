package Gun16;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        //2lerin carpim tablosunu yapalim
        //2x1=2
        //2x2=4
        // ...
        for (int i=1;i<10;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println();
        }
    }
}
