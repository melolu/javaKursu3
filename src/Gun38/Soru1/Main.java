package Gun38.Soru1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        TeslaCar tc=new TeslaCar("model s",2.5);

        ToyotaPrius tp=new ToyotaPrius("Prius",1.88);

        Bus bus=new Bus("scania",4.2);

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tc);
        arabalar.add(tp);
        arabalar.add(bus);

        for (Vehicle vc:arabalar){
            System.out.println(vc.getClass().getSimpleName());
            System.out.println("----------");
            System.out.println("Model= " + vc.getModel());
            System.out.println("Engine = " + vc.getEngine());
            if (vc instanceof TeslaCar){
                System.out.println(((TeslaCar) vc).changeBattery());
                System.out.println(((TeslaCar) vc).drive());
            }
            if (vc instanceof ToyotaPrius){
                System.out.println(((ToyotaPrius) vc).changeBattery());
                System.out.println(((ToyotaPrius) vc).drive());
                System.out.println(((ToyotaPrius) vc).changeOil());

            }
            if (vc instanceof Bus){
                System.out.println(((Bus) vc).drive());
                System.out.println(((Bus) vc).changeDiesel());
            }
            System.out.println();
        }
    }
}
