package Gun20;

import java.util.Scanner;

public class Odev3 {
    //3-reverseString isminde bir method oluşturun.Bu method bir String'i parametre olarak alsın.
    // Ve bu method, girilen String'i tersten yazsın.Terste yazılmış halini yazdırınız.
    // Örn: String = "Java'yı Seviyorum."Print: .muroyiveS ıy'avaJ

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir ifade yaziniz=");
        String ifade= sc.nextLine();
        reverseString(ifade);

    }
    public static void reverseString(String a){
        String tersi="";
        for (int i = a.length()-1; i >= 0; i--) {
            tersi=tersi+a.charAt(i);

        }
        System.out.println(tersi);
    }
}
