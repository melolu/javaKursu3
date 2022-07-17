package Gun15;

import java.util.Scanner;

public class _04_ForLoop {
    public static void main(String[] args) {
        //kullanicinin girecegi bir sayiya kadar olan sayilarin toplamini bulunuz
        Scanner scan=new Scanner(System.in);
        System.out.print("hangi sayiya kadar toplam bulmak istiyorsunuz=");
        int sayi= scan.nextInt();
        int toplam=0;

        for (int i=0;i<=sayi;i++){
            toplam=toplam+i; //toplam+=i
        }
        System.out.println("toplam = " + toplam);
    }
}
