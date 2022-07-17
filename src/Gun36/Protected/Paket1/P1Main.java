package Gun36.Protected.Paket1;

public class P1Main {
    public static void main(String[] args) {
        P1Hayvan h=new P1Hayvan();
        h.ad="karakedi"; //public erisildi
        h.yas=2; // default erisildi
        h.cinsi="tekir"; //protected erisildi
        //h.renk ulasamadik cunku private tanimli ve sadece kendi classi icinden ulasilabilir
    }
}
