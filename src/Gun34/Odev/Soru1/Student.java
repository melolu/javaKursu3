package Gun34.Odev.Soru1;

public class Student {
    private String name;
    private int yas;

    public Student(String name, int yas) {
        setName(name);
        setYas(yas);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
