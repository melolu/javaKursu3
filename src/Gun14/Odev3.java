package Gun14;

public class Odev3 {
    public static void main(String[] args) {
        //3-   100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        System.out.println("100den 0a kadar olan tek sayilarin gosterimi");
        int sayac=100;
        while(sayac>0){
            if (sayac%2==1){
                System.out.print(sayac+",");

            }
            sayac--;
        }
    }
}
