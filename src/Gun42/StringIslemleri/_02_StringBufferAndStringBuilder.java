package Gun42.StringIslemleri;

import java.util.Arrays;

public class _02_StringBufferAndStringBuilder {
    public static void main(String[] args) {
        String cumle="";

        cumle=cumle +"Bugun";
        cumle=cumle +" hava";
        cumle=cumle +" guzel";

        System.out.println("cumle = " + cumle);
        cumle.concat(" oldu"); //boyle hic bi degisiklik olmaz cunku atama yok
        //dogrusu asagidaki gibi
        cumle=cumle.concat(" oldu");
        System.out.println("cumle = " + cumle);

        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır. Fakat paralel çalışan
        // uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.

        StringBuilder sb=new StringBuilder();
        sb.append("Bugun");
        sb.append(" hava");
        sb.append(" guzel");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());

        sb.append(4);//hersey eklenebilir, eklenen seyi stringe cevirip ekler
        System.out.println("sb = " + sb);

        //sb.reverse();//tersine cevirir
        //System.out.println("sb = " + sb);

        sb.delete(0,6);//0 dahil 6 degil indexe gore siler
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3);//belirtilen indexteki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5,"kelime");//5 nolu indexe araya kelime ekleme
        System.out.println("sb = " + sb);

        sb.insert(4,5.46);//4 nolu indexe rakam da double da ekleyebiliyoruz
        System.out.println("sb = " + sb);

        int[] dizi={1,2,43,56};
        sb.insert(6, Arrays.toString(dizi));
        System.out.println("sb = " + sb);

        sb=new StringBuilder("bugun hava sicak");//sifirlandi ilk hale geldi
        System.out.println("sb = " + sb);

        sb.replace(3,8,"bu");//belirli indexler arasindaki stringi
        // girilen stringle degistirme
        System.out.println("sb = " + sb);
    }
}
