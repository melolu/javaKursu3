package Gun38.Odev4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String > shop=new ArrayList<>();
        shop.add("$500");
        shop.add("$6k");
        shop.add("$7k");
        Amazon ama=new Amazon();
        Costco cost=new Costco();
        System.out.println(cost.getClass().getSimpleName());
        System.out.println(cost.getTheTotal(shop));
        System.out.println(cost.isFreeShipping(shop));
        System.out.println();
        System.out.println(ama.getClass().getSimpleName());
        System.out.println(ama.getTheTotal(shop));
        System.out.println(ama.isFreeShipping(shop));

    }
}
