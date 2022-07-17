package Gun03;

public class _06_ScopeInceleme {
    public static void main(String[] args) {
        int a=5; // a degeri asagidaki parantez bolgesinde gecerli olur
                // ancak parantez icindeki bilgiler oraya ozel kalir/

        { //bu parantez icerisindeki yazan tum tanimlamalar burada gecerlidir
            int b = 5;
            b = 77;
            a=8;
            System.out.println("b = " + b);
            System.out.println("a = " + a);
        }
        System.out.println("a = " + a);
    }
}
