package Gun28._03_Soru;

import java.util.ArrayList;

public class Ogrenci {
    String name;
    int maxCredit;
    ArrayList<Ders > dersListesi= new ArrayList<>();

    public void dersEkle(Ders lesson){
        //gelen dersin kredisi + var olan krediyi toplayip
        // kontrol edecegiz, maxCredit geciyor mu?
        int toplamKredi=0;
        for (Ders d:dersListesi) {
            toplamKredi+=d.credit;
        }
        if (toplamKredi+ lesson.credit <= maxCredit) {
            dersListesi.add(lesson);
            System.out.println("Eklendi="+lesson.name);
        }
        else System.out.println("Ders eklenemedi="+lesson.name);
    }
}
