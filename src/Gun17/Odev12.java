package Gun17;

import java.util.Scanner;

public class Odev12 {
    public static void main(String[] args) {
        //12-1- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        //Kelimelerden en uzun olanının ilk ve son harfini degistirin

        Scanner scan=new Scanner(System.in);
        String[] dizi=new String[5];
        for (int i = 0; i < dizi.length; i++) {

            System.out.print("5 farkli kelime giriniz=");
            dizi[i] = scan.next();
        }
            String enUzun=dizi[0];
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i].length()>enUzun.length()){
                enUzun=dizi[i];
            }
        }
        System.out.println("enUzun = " + enUzun);
        System.out.println("en uzun kelimenin ilk ve son harfi degismis hali="+
                enUzun.charAt(enUzun.length()-1)+enUzun.substring(1,enUzun.length()-1)+enUzun.charAt(0));


    }
}
//bitmedi
