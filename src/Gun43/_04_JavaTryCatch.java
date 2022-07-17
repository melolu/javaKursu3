package Gun43;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        String str="";
        int a=5;
        int b=0;
        int c=0;

        try {
            char ilkHarf = str.charAt(0);
            c = a / b;
        }catch (StringIndexOutOfBoundsException hata){ //eger stringle ilgili hata ise bunu alir
            System.out.println("kelime bos oldugu icin harf alinamadi");
        }
        catch (ArithmeticException hata){ //eger aritmetik hataysa bunu alir
            System.out.println("sayi sifira bolunemez");
        }
        catch (Exception hata){ //genel hata anlamina gelir
            System.out.println(hata.getMessage());
        }
    }
}
