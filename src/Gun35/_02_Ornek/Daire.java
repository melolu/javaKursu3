package Gun35._02_Ornek;

public class Daire extends Sekil{
    private int yaricap;

    public Daire(int yaricap) {
        setYaricap(yaricap);
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getAlan() {
        return this.yaricap*this.yaricap*Math.PI;
    }

    @Override
    public double getCevre() {
        return 2*this.yaricap*Math.PI;
    }

    @Override
    public String toString() {
        return super.toString()+"Daire{" +
                "yaricap=" + yaricap +
                '}';
    }
}
