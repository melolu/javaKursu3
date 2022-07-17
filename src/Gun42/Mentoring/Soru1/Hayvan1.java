package Gun42.Mentoring.Soru1;

public class Hayvan1 implements Wild{
    @Override
    public void livesIn() {
        System.out.println("dogada yasar");
    }

    @Override
    public void walks() {
        System.out.println("sessiz yurur");
    }

    @Override
    public void eats() {
        System.out.println("dogada bulduklarini yer");
    }

    @Override
    public void hunts() {
        System.out.println("kendi avlanir");
    }

    @Override
    public void friendlyToHumans() {
        System.out.println("dost canlisi degil yabanidir");
    }
}
