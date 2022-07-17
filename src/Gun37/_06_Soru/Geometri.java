package Gun37._06_Soru;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();
        d.alani(4,5);
        System.out.println("d.alani = " + d.alani(2,8));
        System.out.println("d.cevresi = " + d.cevresi(2,8));

        Daire dr=new Daire();
        System.out.println("dr.alani(5) = " + dr.alani(3));
        System.out.println("dr.cevresi(5) = " + dr.cevresi(3));

        Kare ka=new Kare();
        System.out.println("ka.alani(5) = " + ka.alani(7));
        System.out.println("ka.cevresi(5) = " + ka.cevresi(7));
    }
}
