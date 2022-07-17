package Gun06;

import java.util.Scanner;

public class _12_Soru {
    public static void main(String[] args) {
        //Girilen bir stringde bosluk olup olmadigini bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("bir string giriniz=");

        String girilen=oku.nextLine();
        System.out.println("Bosluk var mi? = " + girilen.contains(" "));
    }
}
