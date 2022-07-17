package Gun37._06_Soru;

public class Daire implements IMethod{

    @Override
    public double cevresi(double... dizi) {
        return Math.PI*dizi[0]*2;
    }

    @Override
    public double alani(double... dizi) {
        return Math.PI*dizi[0]*dizi[0];
    }
}
