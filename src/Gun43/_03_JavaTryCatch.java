package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        try { //dene hatanin basladigi yerin ustune konur
            System.out.println("Program basladi");
            LocalDate tarih = LocalDate.of(2018, Month.JUNE, 40);
            System.out.println("islem tamam");
        } // hata oldugu zaman programi kirma
        catch (Exception hata){ // hata isimli degiskende olusan hatalarin bilgisi ataniyor
            System.out.println("su hata oldu="+hata.getMessage());
        }
        System.out.println("program calismaya devam etti");
        System.out.println("program bitti");
    }
}
