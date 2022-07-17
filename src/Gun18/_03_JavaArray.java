package Gun18;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 elemanli bir diziyi random olarak 100e kadar olan sayilarla doldurunuz.
        //Sonrasinda en buyuk elemani ve indexini bulunuz=

        int[] dizi=new int[100];

        int enbuyuk=dizi[0];
        int enbuyukIndex=0;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*100);

            if (dizi[i]>enbuyuk){
                enbuyuk=dizi[i];
                enbuyukIndex=i;
            }
        }
        System.out.println("enbuyuk dizi["+enbuyukIndex+"]= " + enbuyuk);

    }
}
