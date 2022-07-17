package Gun41;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        //datetime format kisminda full ve long hata veriyor sadece short ve medium calisiyorum
        System.out.println("dt.format() = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
    }
}
