package Gun26._05_Soru;

import java.util.ArrayList;

public class Kampus {
    public static void main(String[] args) {
        //bir kampus programi icin asagidaki ozellikte bilgilerin
        //kaydedilecegi classlari yaziniz
        //Okul: adi, mudur, ucreti(double)
        //Ogrenci: okulNo, tamAd, okulu
        //bu sekilde 1 ogrenci tanimlayip butun bilgileri kendiniz atayip yazdiriniz

        Okul okulBilg=new Okul();
        okulBilg.adi="Samsun Anadolu Lisesi";
        okulBilg.mudur="Zeynel hoca";
        okulBilg.ucreti=200;

        Ogrenci ogrBilg=new Ogrenci();
        ogrBilg.tamAd="Melih Aydin";
        ogrBilg.okulNo=2209;
        //ogrBilg.okulu; //muallakta kaldi :D




    }
}

