package Gun12;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        //kullanicinin girecegi sayi cift ise bir stringe cift atayiniz
        //tek ise tek atayiniz ve ekrana yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("sayi gir=");
        int sayi= scan.nextInt();
        System.out.println(((sayi%2==1) ? "tek" : "cift"));
        // ? operatoru sart(sayi%2==1) dogru ise ilk kismi(tek) degilse ikinci kismi(cift) yazdirir

    }
}
