package Gun18;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        String[] isimler={"ahmet","zeynep","elif","inanc","merve"};
        
        //Arrays.toString ==> diziyi string olarak direk yazdirir
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));

        //Arrays.sort ==> diziyi siralar
        Arrays.sort(isimler);
        System.out.println("isimler = " + Arrays.toString(isimler));
        
        //Arrays.equals(dizi1,dizi2) ==>dizilerin esitligine bakar
        int[] a={1,8,5,0};
        int[] b={1,8,5,0};
        int[] c={14,5,55,7};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); //true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); //false

        Arrays.sort(c);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        //Arrays.fill ==> butun kutucuklara belirtilen degeri atar
        Arrays.fill(c,8);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));


        //Arrays.binarySearch ==>dizi adi ve aranacak sayi girilir. ancak sirali dizilerde calisir o yuzden once sort yapilmali
        int[] rakamlar={4,6,844,42,31,66,52,1,0,5};
        Arrays.sort(rakamlar);
        System.out.println(Arrays.toString(rakamlar));
        System.out.println("rakamlar="+ Arrays.binarySearch(rakamlar,5));
        
        
    }
}
