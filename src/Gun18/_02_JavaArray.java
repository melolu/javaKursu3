package Gun18;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        //kullanicinin girecegi bir cumlede kac kelime oldugunu bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("Cumle giriniz=");
        String cumle= scan.nextLine();
        int boslukSayisi=0;


        for (int i = 0; i <cumle.length() ; i++) {
            if (cumle.charAt(i)== ' ') {
                boslukSayisi++;
            }
        }
        System.out.println("boslukSayisi = " + (boslukSayisi+1));
    }
}
