package Gun28._02_Soru;

public class Soru {
    public static void main(String[] args) {
        //Math sinifindaki metodlarin 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarini
        //kendi isimlendirmenizle ayri bir sinifta yazarak, (kendi metodunuzun icinde Math.fonksiyonlarini kullanabilirsiniz)
        //mainde nesne olusturmadan direk kullanilmasini saglatacak ornek kullanimlarini yaziniz

        System.out.println("maks="+MathMethod.maks(5,15));
        System.out.println("min="+MathMethod.min(12,11));
        System.out.println("mutlak="+MathMethod.mutlak(-4));
        System.out.println("random="+MathMethod.random(5, 12));
        System.out.println("us="+MathMethod.us(2,8));
        int[] dizi={2,45,6,77,89};
        System.out.println("diziToplam="+MathMethod.diziElemanlarTopla(dizi));

    }
}
