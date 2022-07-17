package Gun27._03_Ornek;

public class ElektrikHesabi {
    int toplamTuketim;
    double birimFiyat=0.7;
    double fatura;

    public void tuketimEkle(int tuketim){
        toplamTuketim+=tuketim;
    }

    public void toplamTuketimYaz(){
        System.out.println("toplamTuketim = " + toplamTuketim);
    }
    public void odenecekTutar(){
        fatura=toplamTuketim*birimFiyat;
        System.out.println("odenecek tutar= "+fatura);
    }
}
