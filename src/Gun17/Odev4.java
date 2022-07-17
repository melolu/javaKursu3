package Gun17;

public class Odev4 {
    public static void main(String[] args) {
        //4-int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30 Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] dizi = {15, 25, 22, 18, 30};
        int enbuyuk = dizi[0];
        int ikinciEnb = dizi[0];

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]>enbuyuk){
                ikinciEnb=enbuyuk;
                enbuyuk=dizi[i];
            }
            else if (dizi[i]>ikinciEnb){
                ikinciEnb=dizi[i];
            }
        }
        System.out.println("ikinciEnb = " + ikinciEnb);


    }
}
