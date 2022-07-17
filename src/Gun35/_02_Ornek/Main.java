package Gun35._02_Ornek;

public class Main {
    public static void main(String[] args) {
        Dikdortgen dortgen=new Dikdortgen(6,5);
        System.out.println(dortgen.getAlan());
        System.out.println(dortgen.getCevre());


        Daire daire=new Daire(4);
        System.out.println(daire.getAlan());
        System.out.println(daire.getCevre());


        Kare kare=new Kare(5);
        System.out.println(kare.getAlan());
        System.out.println(kare.getCevre());

    }
}
