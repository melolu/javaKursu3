package Gun38.Odev3;

public class Bicycle implements VehicleClass{
    int speed;
    int gear;

    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    @Override
    public int changeGear() {
        return 0;
    }

    @Override
    public int speedUp() {
        return 0;
    }

    @Override
    public int applyBrakes() {
        return 0;
    }
}
