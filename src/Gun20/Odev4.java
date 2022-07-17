package Gun20;

import java.util.Scanner;

public class Odev4 {
    //4-adı  reverseWord olan bir method oluşturun.Bu methodun String olarak bir parametresi olmalıdır.
    // Ve bu cümledeki kelimelerle tersine çevirmeli.Ters halini yazdırın.
    // Örnek 1 :Dize: Java yazın dönüş şöyle olmalıdır:  yazın Java
    // Örnek 2:Dize: Sakin olun ve evde kalın, dönüş olmalı: kalın evde ve olun sakin

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir ifade yaziniz=");
        String ifade= sc.nextLine();
        System.out.println(reverseWord(ifade));

    }
    public static String reverseWord(String a){
        String[] split=a.split(" ");
        String tersi="";
        for (int i = 0; i < split.length; i++) {
            tersi=split[i].concat(" ").concat(tersi);
        }
    return tersi;
    }
}