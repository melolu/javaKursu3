package Gun27._03_Ornek;

public class Ornek {
    public static void main(String[] args) {
        Musteri m=new Musteri();
        m.name="Melih";
        m.eh=new ElektrikHesabi();
        m.eh.tuketimEkle(100);
        m.eh.tuketimEkle(200);
        m.eh.tuketimEkle(150);

        m.eh.toplamTuketimYaz();
        m.eh.odenecekTutar();



    }
}
