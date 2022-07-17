package Gun35._03_Ornek;

public class Ogrenci {
    private int id;
    private String isim;
    private Sinif sinif;
    private static int sayac=0;


    public Ogrenci(String isim, Sinif sinif) {
        setId(id);
        setIsim(isim);
        setSinif(sinif);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Sinif getSinif() {
        return sinif;
    }

    public void setSinif(Sinif sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", sinif=" + sinif +
                '}';
    }
}
