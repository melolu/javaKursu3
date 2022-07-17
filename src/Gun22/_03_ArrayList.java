package Gun22;

import java.util.ArrayList;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar ilk hali= " + rakamlar);

        //sirala islemleri
        Collections.sort(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        Collections.reverse(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        Collections.fill(rakamlar,0);//butun elemanlara verilen degeri atar.
        System.out.println("rakamlar.fill(0) = " + rakamlar);

        Collections.replaceAll(rakamlar,0,2); //0lari 2 ile degistirdi
        System.out.println("replaceAll(rakamlar 0->2) = " + rakamlar);

    }
}
