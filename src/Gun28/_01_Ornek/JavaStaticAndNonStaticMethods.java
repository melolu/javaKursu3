package Gun28._01_Ornek;

public class JavaStaticAndNonStaticMethods {
    public static void main(String[] args) {
        int sayi=345;
        // 1.yontem
        // javanin kendi ceviri kodunu direk yazdik method kullanmadik
        String strSayi=String.valueOf(sayi);
        int intSayi=Integer.parseInt(strSayi);

        // 2.yontem
        // kendimiz tanimlama yaptik ve ordan kullandik
        Utility util=new Utility();
        strSayi=util.getString(sayi);
        intSayi=util.getInt(strSayi);

        // 3.yontem
        // tanimlama class icinden geldi
        strSayi=Utility.getString2(sayi);
        intSayi=Utility.getInt2(strSayi);


        System.out.println("strSayi = " + strSayi);
        System.out.println("intSayi = " + intSayi);
    }
}
