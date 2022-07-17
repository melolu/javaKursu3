package Gun15;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        //girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdiriniz,bosluklari yazmasin
        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle veya kelime yaziniz=");
        String kelime= scan.nextLine();

        for (int i=0;i<kelime.length();i++){


            if (kelime.charAt(i)==' ') continue; //bosluk gordugunde sonrakileri calistirma


                System.out.println(kelime.charAt(i));
        }



    }
}
