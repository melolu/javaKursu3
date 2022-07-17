package Gun28._02_Soru;

public class MathMethod {
    public static int maks(int a, int b){
        return Math.max(a,b);
    }
    public static int min(int a, int b){
        return Math.min(a,b);
    }
    public static int mutlak(int a){
        return Math.abs(a);
    }
    public static double us(double a,double b){
        return Math.pow(a,b);
    }
    public static int random(int min, int max){
        int rnd=(int)(Math.random()*((max-min)+1))+min;
        return rnd;
    }
    public static int diziElemanlarTopla(int[] a){
        int toplam=0;
        for (int i:a) {
            toplam+=i;
        }
        return toplam;
    }
}
