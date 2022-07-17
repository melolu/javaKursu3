package Gun32._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Pizza> siparis=new ArrayList<>();

        int secim=0;
        do {
            menuGoster();
            secim= sc.nextInt();

            switch (secim){
                case 1:
                    Pizza small=new Pizza(PizzaSize.SMALL);
                    siparis.add(small);break;
                case 2:
                    Pizza medium=new Pizza(PizzaSize.MEDIUM);
                    siparis.add(medium);break;
                case 3:
                    Pizza large=new Pizza(PizzaSize.LARGE);
                    siparis.add(large);break;
                case 4: siparisYaz(siparis);break;
            }
        }while (secim<=4);


    }

    public static void menuGoster(){
        System.out.print("1-Small\n2-Medium\n3-Large\n4-Goster\n5-Cikis\nSECIMINIZ=");
    }
    public static void siparisYaz(ArrayList<Pizza> siparis){
        int smallcount=0;
        int mediumcount=0;
        int largecount=0;
        for (Pizza p: siparis){
            if (p.size==PizzaSize.SMALL)
                smallcount++;
            if (p.size == PizzaSize.MEDIUM)
                mediumcount++;
            if (p.size==PizzaSize.LARGE)
                largecount++;
        }
        System.out.println();
        System.out.println("*************");
        System.out.println("largecount = " + largecount);
        System.out.println("mediumcount = " + mediumcount);
        System.out.println("smallcount = " + smallcount);
        System.out.println("Siparisiniz alinmistir");
        System.out.println("*************");
        System.out.println();
    }

}
