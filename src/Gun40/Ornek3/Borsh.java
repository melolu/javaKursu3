package Gun40.Ornek3;

public class Borsh implements Food{
    void boil(){
        System.out.println("az pismis");
    }
    void eatTomorrow(){
        System.out.println("1 gun dinlenirse lezzeti daha iyi");
    }

    @Override
    public void taste() {
        System.out.println("corba");
    }

    @Override
    public double ucret() {
        return 22;
    }
}
