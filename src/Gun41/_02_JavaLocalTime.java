package Gun41;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) throws InterruptedException {
        //saat
        LocalTime saat=LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        //kendi formatimizi yapalim
        DateTimeFormatter ozelformat1=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("saat = " + saat.format(ozelformat1));


        //canli saat
        DateTimeFormatter ozelformat2=DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true){
            saat=LocalTime.now();
            System.out.print("\rsaat = " + saat.format(ozelformat2));

            Thread.sleep(1000);
        }

    }
}
