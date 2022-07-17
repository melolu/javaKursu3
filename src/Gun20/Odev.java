package Gun20;

public class Odev {
    //1-Ismi **randomNum** olan bir method oluşturun.Parametre olarak **int max** almalı.
    // Bu method, 0 ile max arasında random bir değer döndürmelidir.Random numarayı döndürünüz.
    public static void main(String[] args) {
        randomNum();
    }
    public static void randomNum(){
        int random=(int)(Math.random()*Integer.MAX_VALUE);
        System.out.println("random = " + random);
    }
}
