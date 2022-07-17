package Gun37._06_Soru;

public class Dikdortgen implements IMethod{

    @Override
    public double cevresi(double... dizi) {
        if (dizi.length==1)
            return (dizi[0]*dizi[0])*2;
        return (dizi[0]+dizi[1])*2;
    }

    @Override
    public double alani(double... dizi) {
        if (dizi.length==1)
            return dizi[0]*dizi[0];
        return dizi[0]*dizi[1];
    }
}
