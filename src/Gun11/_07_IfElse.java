package Gun11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        //girilen bir passwordun kurallara uygunlugunu kontrol ediniz
        //kurallar: 1-en az 8 karakter olmali 2-icinde pass kelimesi olmamali 3-en fazla 12 karakter olmali
        Scanner scan = new Scanner(System.in);
        System.out.print("bir password giriniz=");
        String password = scan.next();
        boolean geciyorMu=password.contains("pass");

        if (password.length() >= 8  && password.length() <=12 && geciyorMu==false){
            System.out.println("sifre kabul edildi");
        }
        else{
            System.out.println("sifre kabul edilmedi");
        }
    }
}
