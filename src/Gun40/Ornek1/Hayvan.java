package Gun40.Ornek1;

public abstract class Hayvan {
    private int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;
    static int sayac=0;


    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setId();
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);

    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = ++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.print("yiyecegi=");yiyecegi();
        System.out.print("yemek miktar=");yemekMiktari();
        System.out.print("uyku suresi=");gunlukUykuSuresi();
        System.out.print("sesi=");sesi();
        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
