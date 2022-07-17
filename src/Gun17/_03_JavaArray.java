package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        int [] dizi=new int[5];

        int[] dizi2={1,2,3,4,5,6,7,8}; //hem uzunlugu hem degeleri tanimlanmis hali

        String[] kelimeler=new String[5];
        boolean[] dizi3=new boolean[5];
        double[] oranlar=new double[5];

        for (int i=0;i<dizi.length;i++){
            System.out.println("dizi = " + dizi[i]);
        }
        for (int i=0;i< dizi2.length;i++){
            System.out.println("dizi2 = " + dizi2[i]);
        }
        for (int i=0;i< kelimeler.length;i++){
            System.out.println("kelimeler = " + kelimeler[i]);
        }
        for (int i=0;i< dizi3.length;i++){
            System.out.println("dizi3 = " + dizi3[i]);
        }
        for (int i=0;i< oranlar.length;i++){
            System.out.println("oranlar = " + oranlar[i]);
        }

    }
}
