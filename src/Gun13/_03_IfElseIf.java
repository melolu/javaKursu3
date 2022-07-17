package Gun13;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        //kullanicidan fizik:90 seklinde not bilgisini aliniz
        //>=90 icin A, >=80 icin B, >=70 C, >=60 icin D, >=40 icin E, <40 icin F yazdiriniz
        Scanner oku = new Scanner(System.in);
        System.out.print("dersin adini ve notunuzu giriniz=");
        String adNot= oku.nextLine();
        int not=Integer.parseInt(adNot.replaceAll("[^0-9]","")); //rakam disindakileri sil
        String dersAd=adNot.replaceAll("[0-9]",""); //rakamlari sil

        System.out.println("dersAd = " + dersAd);
        System.out.println("not = " + not);

        if (not>=90)
            System.out.println("A");
        else
            if (not>=80)
                System.out.println("B");
            else
                if (not>=70)
                    System.out.println("C");
                else
                    if (not>=60)
                        System.out.println("D");
                    else
                        if (not>=40)
                            System.out.println("E");
                        else
                            System.out.println("F");

    }
}
