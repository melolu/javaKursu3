package Gun39.Ornek2;

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
    double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    double cevre() {
        return 2*Math.PI*yaricap;
    }
}
