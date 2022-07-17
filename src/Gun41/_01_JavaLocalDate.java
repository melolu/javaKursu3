package Gun41;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate sadece gun,ay,yil bilgisi tutar
        LocalDate tarih=LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        
        
        //locale gore gosteriyor suan
        System.out.println("tarih.format(ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println(tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        
        //localdeki saati aldim almanyaya gore gosterdim
        System.out.println("tarih(ALMANYA)=" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        System.out.println("tarih(FRANSA)=" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.FRANCE)));


        //kendi formatimizi yapalim
        System.out.println("tarih = " + tarih);//2022-06-22
        DateTimeFormatter ozelformat1=DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("tarih.format(ozelformat1) = " + tarih.format(ozelformat1));//22/6/22

        DateTimeFormatter ozelformat2=DateTimeFormatter.ofPattern("EEEE dd.MM.yy"); //Çarşamba 22.06.22
        System.out.println("tarih.format(ozelformat2) = " + tarih.format(ozelformat2));

        //kendi tarihimizi olusturalim
        LocalDate kenditarih1=LocalDate.of(2011,4,12);
        LocalDate kenditarih2=LocalDate.of(2016, Month.APRIL,4);
        System.out.println("kenditarih1 = " + kenditarih1);
        System.out.println("kenditarih2 = " + kenditarih2);


    }
}
