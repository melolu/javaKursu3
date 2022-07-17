package Gun06;

public class _10_StringIsEmpty {
    public static void main(String[] args) {
        //stringin bos olup olmadigini boolean olarak soyler
        String s1="Merhaba";
        System.out.println("s1 = " + s1.isEmpty()); //false

        String s2=" ";
        System.out.println("s2 = " + s2.isEmpty()); //false

        String s3="";
        System.out.println("s3 = " + s3.isEmpty()); //true
    }
}
