package Gun17;

public class Odev7 {
    public static void main(String[] args) {
        //7-Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
        // ilk ve son elementlerini kapsayan yeni array'e return edin.
        // Oluşturacağınız int array'i =   ([1, 2, 3, 4])
        // Sonuç bu şekilde olmalıdır. [1, 4]

        int[] dizi1={1,2,3,4};
        int[] dizi2={dizi1[0],dizi1[3]};
        for (int i = 0; i < dizi2.length; i++) {
            System.out.println("dizi2 = " + dizi2[i]);
        }


    }
}