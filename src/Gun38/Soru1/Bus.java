package Gun38.Soru1;

public class Bus extends Vehicle implements IDiesel{

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "sehir icine girmek yasak, yavas surus";
    }
}
