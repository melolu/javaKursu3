package Gun38.Soru2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal cat=new Cat();
        Animal sw=new Swallow();
        Animal sh=new Shark();
        Animal dc=new Duck();

        ArrayList<Animal> hayvanlar=new ArrayList<>();
        hayvanlar.add(cat);
        hayvanlar.add(sw);
        hayvanlar.add(sh);
        hayvanlar.add(dc);

        for (Animal a:hayvanlar){
            System.out.println(a.getClass().getSimpleName());
            System.out.println("a.food() = " + a.food());
        }
    }
}
