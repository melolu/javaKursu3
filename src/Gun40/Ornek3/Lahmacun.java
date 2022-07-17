package Gun40.Ornek3;

public class Lahmacun implements Food{
    void dough(){
        System.out.println("ince hamurdan yapildi");
    }
    void addMeat(){
        System.out.println("kiymali");
    }
    void bake(){
        System.out.println("kisik ateste pisirildi");
    }

    @Override
    public void taste() {
        System.out.println("citir citir ve lezzetli");
    }

    @Override
    public double ucret() {
        return 33;
    }
}
