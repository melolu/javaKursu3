package Gun42.Mentoring.Soru1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hayvan1 hayvan1=new Hayvan1();
        Hayvan2 hayvan2=new Hayvan2();

        hayvan1.livesIn();
        hayvan1.walks();
        hayvan1.eats();
        hayvan1.friendlyToHumans();
        hayvan1.hunts();


    }
}
