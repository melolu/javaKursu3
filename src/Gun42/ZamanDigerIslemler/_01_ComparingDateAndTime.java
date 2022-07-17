package Gun42.ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.LocalTime;

public class _01_ComparingDateAndTime {
    public static void main(String[] args) {
        LocalDate bugun= LocalDate.now();
        LocalDate dun=bugun.minusDays(1);// 1 gun once oldu
        System.out.println("dun = " + dun);

        boolean sonraMi=bugun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);

        boolean onceMi=bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        boolean artikYil=bugun.isLeapYear();
        System.out.println("artikYil = " + artikYil);

        int fark=bugun.compareTo(dun);//aradaki en buyuk degerin farkini verir. sayisal olarak degil
        //yil>ay>hafta>gun>saat>dakika gibi dusun
        System.out.println("fark = " + fark);
    }
}
