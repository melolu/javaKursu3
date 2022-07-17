package Gun17;

public class Odev3 {
    public static void main(String[] args) {
        //3-int Array oluşturun ve elemanları : 14 , 19 , 5 , 21 En küçük (minimum) sayıyı yazdırınız.

        int[] dizi={14,19,5,21};
        int enkucuk =dizi[0];
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]<enkucuk){
                enkucuk=dizi[i];
            }
        }
        System.out.println("enkucuk = " + enkucuk);
    }
}
