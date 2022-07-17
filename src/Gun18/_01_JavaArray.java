package Gun18;

public class _01_JavaArray {
    public static void main(String[] args) {
        //50 elemanli bir dizi tanimlayiniz. 10a kadar olan sayilardan random atayarak doldurunuz
        //Sonrasinda ayri bir dongu ile tek olanlar 1 cift olanlara 2 atayiniz

        int[] dizi=new int[50];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*10);

            System.out.println("1.dizi["+i+"] = " + dizi[i]);
        }

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0){
                dizi[i]=2;
            }
            else
                dizi[i]=1;
            System.out.println("2.dizi["+i+"] = " + dizi[i]);
        }

    }
}
