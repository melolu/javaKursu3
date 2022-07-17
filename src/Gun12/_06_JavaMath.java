package Gun12;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a'nin mulak degeri = " + Math.abs(a)); //mutlak deger
        System.out.println("a ve b den en buyuk olani= "+ Math.max(a,b)); //en buyuk degeri verir
        System.out.println(Math.pow(4,2)); //us alma (eger pow(8,1.0/3.0) yazarsan kok bulursun)
        /*
        Math.round(3.5) //4
        Math.round(3.1) //3
        Math.ceil(3.1) // buyuk en yakin tam sayi 4
        Math.ceil(3.5) // buyuk en yakin tam sayi 4
        Math.floor(3.1) // kucuk en yakin tam sayi 3
        Math.floor(3.5) // kucuk en yakin tam sayi 3
        */
    }
}
