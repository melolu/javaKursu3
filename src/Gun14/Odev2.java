package Gun14;

public class Odev2 {
    public static void main(String[] args) {
        //2-  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz.
        System.out.println("0-100 arasindaki sayilardan tekler ve ciftlerin toplamlarini ayri ayri yazdiralim.");
        int teklerToplam=0;
        int ciftlerToplam=0;
        int sayac=0;
        while (sayac<=100){
            if (sayac%2==0){
                ciftlerToplam=ciftlerToplam+sayac;
            }
            if (sayac%2==1){
                teklerToplam=teklerToplam+sayac;
            }
            sayac++;
        }
        System.out.println("ciftlerToplam = " + ciftlerToplam);
        System.out.println("teklerToplam = " + teklerToplam);
        System.out.println("genel toplam = "+ (ciftlerToplam+teklerToplam));
    }
}
