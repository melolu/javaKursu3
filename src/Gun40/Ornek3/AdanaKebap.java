package Gun40.Ornek3;

public class AdanaKebap implements Food{
    void marinade() {
        System.out.println("bol baharatli ve zirhtan gecmis");
    }

    void grill() {
        System.out.println("komur atesinde pismis");
    }

    @Override
    public void taste() {
        System.out.println("acili ve tuzlu tadi var");
    }

    @Override
    public double ucret() {
        return 55;
    }

}
