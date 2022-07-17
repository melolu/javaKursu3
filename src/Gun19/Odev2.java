package Gun19;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        //2-  2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi
        //    ve rakam olan değerlerle doldurunuz.
        //    sonrasında bütün RAKAMLARI toplayıp ö toplam para değerini bulunuz.

        String[][] dizi=new String[2][3];
        Scanner scan=new Scanner(System.in);
        int para=0;
        int toplam=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("parayi giriniz. orn($10)=");
                dizi[i][j]= scan.next();

                para=Integer.parseInt(dizi[i][j].replace("$",""));
                toplam=toplam+para;
            }
        }
        System.out.println("toplam = " + toplam);
    }
}
