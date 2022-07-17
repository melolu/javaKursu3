package Gun30.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
        Calisan cal1=new Calisan();
        cal1.id=1;
        cal1.name="Melih";
        cal1.surName="Aydin";
//      cal1.password="1234";

        cal1.sifreAta("merha");
        cal1.sifreGoster();
    }
}
