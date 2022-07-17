package Gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _04_ZonedDateTime {
    public static void main(String[] args) {
        //baska zaman dilimlerinin zaman bilgisini alma

        ZonedDateTime zonedDateTimeLokal=ZonedDateTime.now(); //suanki bolgemizi alir
        System.out.println("zonedDateTime = " + zonedDateTimeLokal);


        ZoneId zoneNY=ZoneId.of("America/New_York");
        ZonedDateTime zdt=ZonedDateTime.now(zoneNY);
        System.out.println("zdt = " + zdt);

        Set<String> zamanbolgeleri=ZoneId.getAvailableZoneIds();
        for (String zaman:zamanbolgeleri){
            if (zaman.toLowerCase().contains("flor")) {
                System.out.println("zaman = " + zaman);
            }
        }

    }
}
