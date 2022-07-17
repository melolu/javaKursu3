package Gun41.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {
    //2 tarih arasindaki farki gosterir
    //LocalDate'ler icin kullanilir
    public static void main(String[] args) {
        LocalDate dogumtarihi=LocalDate.of(1996,10,15);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dogumtarihi,bugun);
        System.out.println("fark = " + fark);
        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);


        LocalDate ucGunSonra=bugun.plus(period3Gun);//bugune 3 gun eklemek
        System.out.println("ucGunSonra = " + ucGunSonra);
        LocalDate ucAySonra=bugun.plus(period3Ay);//bugune 3 ay eklemek
        System.out.println("ucAySonra = " + ucAySonra);

        //ornek olarak kurs suresi hesabi
        LocalDate kursBaslangici=LocalDate.of(2022,4,18);
        LocalDate kursBitis=kursBaslangici.plus(Period.ofMonths(6));
        System.out.println("kursBitis = " + kursBitis);

        Period kacGunKaldi=Period.between(bugun,kursBitis);
        System.out.println(kacGunKaldi.getMonths()+" ay "+ kacGunKaldi.getDays()+" gun kaldi");
    }
}
