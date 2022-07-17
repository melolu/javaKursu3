package Gun42.StringIslemleri;

public class _01_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="bugun hava cok guzel";
        String cumle2="bugun hava cok guzel";
        String cumle3=new String("bugun hava cok guzel");
        String cumle4=new String("bugun hava cok guzel");

        if (cumle1==cumle2)
            System.out.println("cumle1 cumle2 ye esit");
        else System.out.println("cumle1 cumle2 ye esit degil");

        if (cumle1.equals(cumle2))
            System.out.println("cumle1 cumle2 ye esit");
        else System.out.println("cumle1 cumle2 ye esit degil");

        if (cumle3==cumle4)//ilkel tipler icin degerleri ayni mi, nesneler icin ayni nesne mi
            //diye karsilastirma yapar
            System.out.println("cumle3 cumle4 ye esit");
        else System.out.println("cumle3 cumle4 ye esit degil");

        if (cumle3.equals(cumle4))//ilkel tipler ve nesneler icin degerleri ayni mi diye bakar
            System.out.println("cumle3 cumle4 ye esit");
        else System.out.println("cumle3 cumle4 ye esit degil");
    }
}
