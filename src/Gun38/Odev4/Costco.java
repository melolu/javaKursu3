package Gun38.Odev4;

import java.util.ArrayList;

public class Costco implements deliveryOptions{
    @Override
    public int getTheTotal(ArrayList<String> a) {
        int toplam=0;
        int sayi=0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).toLowerCase().contains("k")){
                sayi=Integer.parseInt(a.get(i).replaceAll("[^\\d-]",""));
                sayi=sayi*1000;
                toplam=toplam+sayi;
            }
            else {
                sayi=Integer.parseInt(a.get(i).replaceAll("[^\\d-]",""));
                toplam=toplam+sayi;
            }
        }
        return toplam;
    }
    @Override
    public String isFreeShipping(ArrayList<String> b) {
        if (getTheTotal(b)>costcoMinFreeDelivery)
            return "you are eligible for free delivery";
        else return "you need to buy ... amount of item";
    }
}
