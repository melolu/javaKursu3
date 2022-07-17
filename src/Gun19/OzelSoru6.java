package Gun19;

import java.util.Scanner;

public class OzelSoru6 {
    //6- İçinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String
    //okutunuz
    //okunan bu 3 string içindeki negatif de olabilen sayıları toplayın.
    //Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.
    //Ornek:
    //String num1 = "$15";
    //String num2 = "$20";
    //String num3 = "$30";
    //output ----> 65; olmali
    //String num1 = "$15";
    //String num2 = "$-80";
    //String num3 = "$30";
    //output ----> -1; olmali
    public static void main(String[] args) {
        int sayac=0;
        int toplam=0;
        while(sayac<3) {
            Scanner sc = new Scanner(System.in);
            System.out.print("para birimi ve degeri giriniz=");
            String para = sc.next();
            String strParaDegeri = para.replace("$", "");
            int paraDeger = Integer.parseInt(strParaDegeri);
            toplam=toplam+paraDeger;
            sayac++;
        }
        if (toplam>0)
            System.out.println("toplam = " + toplam);
        else System.out.println("-1");
    }
}
