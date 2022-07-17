package Gun40.Ornek1;

public class Kedi extends Hayvan{


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("mama");
    }

    @Override
    void yemekMiktari() {
        System.out.println("gunde 3 kez");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("ne zaman isterse");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }
}
