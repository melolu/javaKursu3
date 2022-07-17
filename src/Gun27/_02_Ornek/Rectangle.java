package Gun27._02_Ornek;

public class Rectangle {
    int width;
    int length;

    public void dortgenCevre(){
        System.out.println("cevre = " + (width+length)*2);
    }
    public void dortgenAlan(){
        System.out.println("alan = " + (width*length));
    }
}
