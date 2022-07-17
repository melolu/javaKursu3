package Gun34._03_Ornek;

public class SirketMain {
    public static void main(String[] args) {
        Calisan cal1=new Calisan("melih",4500,1);
        System.out.println("maas="+cal1.maasHesapla());
        System.out.println("cal1 = " + cal1);

        GenelMudur mud1=new GenelMudur("sebnem",5000,2,1500);
        System.out.println();
        System.out.println("mud1 = " + mud1);
        System.out.println("maas="+mud1.maasHesapla());
    }
}
