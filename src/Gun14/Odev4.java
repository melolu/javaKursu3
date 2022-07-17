package Gun14;

public class Odev4 {
    public static void main(String[] args) {
        //4-  0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.
        System.out.println("0 ile 100 arasinda 4 ve 5e bolunen sayilar=");
        int sayac=0;
        while (sayac<100){
            if (sayac%4==0 && sayac%5==0){
                System.out.print(sayac+",");
            }
            sayac++;
        }
    }
}
