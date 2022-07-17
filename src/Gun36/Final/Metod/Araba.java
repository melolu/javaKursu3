package Gun36.Final.Metod;

public class Araba extends Tasit{
    private String renk;
    public Araba(String model) {
        super(model);
    }

    public void arabaYazdir(){
        System.out.println("renk = " + renk);
    }
}
