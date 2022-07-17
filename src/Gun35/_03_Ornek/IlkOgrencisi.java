package Gun35._03_Ornek;

public class IlkOgrencisi extends Ogrenci{
    private String klup;
    public IlkOgrencisi(String isim,Sinif sinif,String klup) {
        super(isim,sinif);
        setKlup(klup);
    }
    public String getKlup(){
        return klup;
    }
    public void setKlup(String klup){
        this.klup=klup;
    }

    @Override
    public String toString() {
        return "IlkOgrencisi{" +
                "klup='" + klup + '\'' +
                "} " + super.toString();
    }
}
