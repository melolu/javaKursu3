package Gun09;

public class _02_JavaArithmeticOperators {
    public static void main(String[] args) {
        int sayac=0;
        sayac=sayac+1; //sayacin degerini 1 artirir sayac=1
        sayac++; //sayacin degerini 1 artirir sayac=2
        ++sayac; //sayacin degerini 1 artirir sayac=3

        sayac=sayac-1; //sayacin degerini 1 azaltir sayac=2
        sayac--; //sayacin degerini 1 azaltir sayac=1
        --sayac; //sayacin degerini 1 azaltir sayac=0

        int sonuc=0;
        sonuc=sayac+1;  //once islem yapilir sonra sayacin degeri 1 artirilir.
                        //bu duruma gore sonuc=sayac; sayac=sayac+1
                        //sonuc=0 sayac=1

        sayac=0;
        sonuc=++sayac;  //once ++islemi yapilir sonra diger isleme gecilir
                        // sayac=sayac+1, sonuc=sayac sayac=1 sonuc=1
    }
}
