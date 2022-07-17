package Gun42.ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        //kullanicidan alinan ve string durumunda olan bir time veya tarih
        //bilgisinin time veya tarih degiskenine cevrilmesi
        String strDate="25 01 2020";

        //String degeri tarihe cevirmek icin format belirledik.
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd MM yyyy");


        //Stringin formati bu formata uygun olmali parse ile cevirdik
        LocalDate tarih=LocalDate.parse(strDate,format);
        System.out.println("tarih = " + tarih);

    }
}
