package Gun36.Polyformphism;

public class CiftlikMain {
    public static void main(String[] args) {
        Kopek kopek1=new Kopek("karabas");
        Kedi kedi1=new Kedi("badem");

        Hayvan kopek2=new Kopek("kurt");
        Hayvan kedi2=new Kedi("tekir");

        kopek1.ses(); //gercekten kopek
        kopek1.kokladi();// gercekten kopek
        kopek2.ses(); //hayvan gibi gorunuyor ama kopek
        System.out.println("---");
        hayvanSes(kopek1);
        hayvanSes(kedi1);
        hayvanSes(kopek2);
        hayvanSes(kedi2);
    }
    public static void hayvanSes(Hayvan h){
        h.ses();
    }
}
