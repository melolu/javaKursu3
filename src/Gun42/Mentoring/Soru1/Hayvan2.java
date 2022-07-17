package Gun42.Mentoring.Soru1;

public class Hayvan2 implements Domestic{
    @Override
    public void livesIn() {
        System.out.println("evde yasar");
    }

    @Override
    public void walks() {
        System.out.println("4 ayakli");
    }

    @Override
    public void eats() {
        System.out.println("kuru mama yer");
    }

    @Override
    public void name() {
        System.out.println("kedi");
    }

    @Override
    public void takeCare() {
        System.out.println("iyi huylu");
    }
}
