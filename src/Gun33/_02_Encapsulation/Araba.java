package Gun33._02_Encapsulation;

public class Araba {
    private String renk;
    private String model;
    private int motorHacmi;
    private int kapiSayisi;

    public Araba(String renk, String model, int motorHacmi, int kapiSayisi) {
     // this.renk = renk;
     // this.model = model;
     // this.motorHacmi = motorHacmi;
     // this.kapiSayisi = kapiSayisi;
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapiSayisi(kapiSayisi);
    }

    public Araba() {
    }

    //sag tik generate, getter setter ve asagisi olustu
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
