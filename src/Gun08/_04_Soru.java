package Gun08;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //girilen bir passwordun sizin bildiginiz bir kelimeyle es olup olmadigini bulunuz
        String password="bayrak";
        Scanner scan=new Scanner(System.in);
        System.out.print("password=");
        String passwScan=scan.next();

        System.out.println("password = " + passwScan.equals(password));
    }
}
