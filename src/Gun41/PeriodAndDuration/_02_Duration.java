package Gun41.PeriodAndDuration;

import java.time.Duration;
import java.time.LocalTime;

public class _02_Duration {
    //Localtime ve LocalDateTime'lar icin kullanilir
    //bunlarin arasindaki farklari gosterir
    public static void main(String[] args) {
        LocalTime geceYarisi=LocalTime.of(0,0);
        LocalTime ogleVakti=LocalTime.of(13,3,2);

        Duration fark=Duration.between(geceYarisi,ogleVakti);
        System.out.println("fark = " + fark);
        System.out.println("fark saat = " + fark.toHours());
        System.out.println("fark dakika = " + fark.toMinutes());
        System.out.println("fark milisaniye = " + fark.toMillis());

        System.out.println("fark saniye = " + fark.toMinutes()*60);
        System.out.println("fark.getSeconds() = " + fark.getSeconds());
    }
}
