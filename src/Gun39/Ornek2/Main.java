package Gun39.Ornek2;

public class Main {
    public static void main(String[] args) {
        Dikdortgen drt=new Dikdortgen(3,8);
        drt.setName("Dikdortgen");
        System.out.println("drt = " + drt);
        drt.ciz();


        Daire daire=new Daire(4);
        daire.setName("Daire");
        System.out.println("daire = " + daire);
        daire.ciz();
    }
}
