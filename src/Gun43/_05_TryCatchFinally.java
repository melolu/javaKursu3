package Gun43;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        long startTime=0;
        String str="";
        try {
            startTime=System.currentTimeMillis();
            System.out.println("hatadan onceki nokta");
            char ilkHarf=str.charAt(0);
            System.out.println("hatadan sonraki nokta");
        }catch (Exception hata){
            System.out.println("catch blogu calisti");
        }
        finally {
            long gecenSure= System.currentTimeMillis() - startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloguyla ilgili son yapilacaklar");

            //hata olsun veya olmasin calisacak final bolumu her zaman calisir
            //kullanim sebebi: try catch'in icinde yapilmis islemlerde arta kalan
            //kapama gibi bu bolume ait islemler yapilarak kod duzeni saglanir
        }

        System.out.println("try-catch blogundan sonra calisan kisim");
    }
}
