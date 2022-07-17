package Gun20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();
        merhabaYaz();
        ismeMerhabaYaz("melih");
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya1");
    }

    public static void ismeMerhabaYaz(String isim){
        System.out.println(isim+" Merhaba Dunya");
        System.out.println(isim+" Merhaba Dunya3");
    }
}
