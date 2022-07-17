package Gun35.Odev;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Okul okul1=new Okul();
        okul1.ismi="omu";
        okul1.maxOgrSayisi=20;

        Ogrenci ogr1=new Ogrenci("melih","samsun/ilkadim",okul1,UyeTipi.OGRENCI,3500);
        Ogrenci ogr2=new Ogrenci("sebnem","samsun/atakum",okul1,UyeTipi.OGRENCI,4000);
        Calisan cal1=new Calisan("anil","samsun/canik",okul1,UyeTipi.CALISAN,6000);
        Calisan cal2=new Calisan("aydin","samsun/atakum",okul1,UyeTipi.CALISAN,7500);

        okul1.ogrenciler.add(ogr1);
        okul1.ogrenciler.add(ogr2);
        okul1.calisanlar.add(cal1);
        okul1.calisanlar.add(cal2);

    }
}
