package Gun28._01_Ornek;

public class Utility {
    //bu yontemde method nesneye ait
    public String getString(int sayi){
        return String.valueOf(sayi);
    }
    public int getInt(String str){
        return Integer.parseInt(str);
    }
    //bu yontemde method classa ait
    public static String getString2(int sayi){
        return String.valueOf(sayi);
    }
    public static int getInt2(String str){
        return Integer.parseInt(str);
    }
}
