package Gun38.Mentoring;

import java.util.Scanner;

public class Member {
    private String ad;
    private String soyad;
    private int gelir;
    private Sinif sinif;

    public Member(String ad, String soyad, int gelir) {
        setAd(ad);
        setSoyad(soyad);
        setGelir(gelir);
        setSinif(gelir);

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        Scanner sc=new Scanner(System.in);
        boolean uygunMu=false;
        do {
            if (ad.length()<2){
                System.out.println("ad en az 2 harften olusmali\n yeni isim girin");
                ad= sc.nextLine();
            }
            else {
                uygunMu=true;
            }
        }while (!uygunMu);

        this.ad=ad;

    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getGelir() {
        return gelir;
    }

    public void setGelir(int gelir) {
        this.gelir = gelir;
    }

    public Sinif getSinif() {
        return sinif;
    }

    public void setSinif(int aylikGelir) {
        if (aylikGelir<20000){
            this.sinif=Sinif.FAFAKIR;
        }
        else if (aylikGelir<70000){
            this.sinif=Sinif.FAKIR;
        }
        else if (aylikGelir<150000){
            this.sinif=Sinif.ORTADIREK;
        }
        else if (aylikGelir>150000){
            this.sinif=Sinif.ZENGIN;
        }else this.sinif=Sinif.ZENGIN;
    }
}
