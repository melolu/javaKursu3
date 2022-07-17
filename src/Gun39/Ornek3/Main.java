package Gun39.Ornek3;

public class Main {
    public static void main(String[] args) {
        Baklava baklava=new Baklava();
        baklava.madeIn();
        baklava.taste();
        System.out.println();
        CheeseCake ck=new CheeseCake();
        ck.madeIn();
        ck.taste();
        System.out.println();
        GreekSalad gs=new GreekSalad();
        gs.madeIn();
        gs.taste();
        System.out.println();
        SezarSalad ss=new SezarSalad();
        ss.madeIn();
        ss.taste();
    }
}
