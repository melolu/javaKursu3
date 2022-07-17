package Gun13;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ogrenilmek istenen ayin numarasini giriniz=");
        int ayNo= scan.nextInt();

        switch (ayNo){
            case 1: System.out.println("Ocak 31"); break;
            case 2: System.out.println("Subat 28"); break;
            case 3: System.out.println("Mart 31"); break;
            case 4: System.out.println("Nisan 30"); break;
            case 5: System.out.println("Mayis 31"); break;
            case 6: System.out.println("Haziran 30"); break;
            case 7: System.out.println("Temmuz 31"); break;
            case 8: System.out.println("Agustos 31"); break;
            case 9: System.out.println("Eylul 30"); break;
            case 10: System.out.println("Ekim 31"); break;
            case 11: System.out.println("Kasim 30"); break;
            case 12: System.out.println("Aralik 31"); break;
        }
    }
}
