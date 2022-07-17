package Gun02;

public class _05_Degiskenler {
    public static void main(String[] args) {
        // degiskenler
        int sayi; // int: int miktarinca alan kaplayan tam sayi tipi
        sayi=5;
        System.out.print("sayi=");
        System.out.println(sayi); //tirnak acarsan kelimeyi yazar unutma
        System.out.println("sayi="+sayi); // + onemlidir unutma

        sayi=7; //en son hangi degeri atarsan onu kabul eder
        int kisaKenar=5;
        int uzunKenar=7;
        int cevre=2*(5+7);
        System.out.println("cevre="+cevre);

        kisaKenar=sayi; //kisa kenar degeri 7 olarak atandi
        cevre= 2*(kisaKenar+uzunKenar);
        System.out.println("cevre = " + cevre);

    }
}
