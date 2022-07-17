package Gun15;

import java.util.Scanner;

public class _07_Continue {
    public static void main(String[] args) {
        //kullanicidan 5 sayi isteyiniz
        //bu sayilardan 6 ile 10 arasindakiler haric,digerleri toplansin
        Scanner scan=new Scanner(System.in);

        int toplam=0;

        for (int i=1;i<=5;i++){
            System.out.print("Bir sayi giriniz=");
            int sayi= scan.nextInt();

            if (sayi>6 && sayi<10)
                continue; //calistiginda sonraki adimlari pas gecer ve dongu devam eder

                toplam=toplam+sayi;


        }
        System.out.println("toplam = " + toplam);
    }
}
