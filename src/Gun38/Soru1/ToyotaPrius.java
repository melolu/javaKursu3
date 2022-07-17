package Gun38.Soru1;

public class ToyotaPrius extends Vehicle implements IElectric,IGas{

    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeOil() {
        return "bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "ilk 10 km elektrikle gider";
    }

    @Override
    public String changeBattery() {
        return "Omur boyu kullan";
    }
}
