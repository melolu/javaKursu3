package Gun40.Ornek1;

public class Kartal extends Hayvan{


    public Kartal(String isim, boolean vahsi, String dogumTarihi)
    {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("tavsan, keklik");
    }

    @Override
    void yemekMiktari() {
        System.out.println("buldukca");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("yalnizca geceleri");
    }

    @Override
    void sesi() {
        System.out.println("yirtici ses");
    }
}
