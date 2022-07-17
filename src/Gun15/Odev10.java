package Gun15;

import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {
        //10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen önce girilenden büyük ise döngü sonlansın.

        Scanner scan=new Scanner(System.in);
        int ilk=Integer.MAX_VALUE;
        for (int i=0;i<10;i++){

            System.out.print("sayi giriniz=");
            int sayi= scan.nextInt();

            if (sayi>ilk)
                break;
            else ilk=sayi;
        }
    }
}
