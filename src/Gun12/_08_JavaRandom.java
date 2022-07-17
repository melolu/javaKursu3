package Gun12;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //0 ile 6 arasinda random sayi ureten programi yaziniz
        //Math.random() 0.0000 ile 0.99999 arasi rasgele sayi uretir
        double doubleRandom=Math.random();
        System.out.println("doubleRandom = " + doubleRandom);

        int Tamsayi=(int)(doubleRandom*6); //0-6 arasi rasgele sayi vermesi icin
        System.out.println("Tamsayi = " + Tamsayi);

        int Tamsayi2=(int)(doubleRandom*15); //0-15 arasi rasgele sayi vermesi icin
        System.out.println("Tamsayi2 = " + Tamsayi2);
    }
}
