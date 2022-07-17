package Gun40.Ornek3;

public class Palov implements Food{
    void fry(){
        System.out.println("teflonda yapildi");
    }
    void boil(){
        System.out.println("20 dakikada kisik ateste pisti");
    }

    @Override
    public void taste() {
        System.out.println("tane tane pirincler");
    }

    @Override
    public double ucret() {
        return 44;
    }
}
