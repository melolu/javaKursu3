package Gun39.Ornek2;

public abstract class Sekil {
    private String name;

    abstract double alan();
    abstract double cevre();

    public void ciz(){
        System.out.println(this.name+" isimli sekil cizildi");
    }
    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan="+ Math.round(alan()) + '\'' +
                "cevre="+ Math.round(cevre()) + '\''+
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
