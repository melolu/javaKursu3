package Gun21;

public class _03_JavaMethod {
    public static void main(String[] args) {
        String ad="melih";
        String soyad="aydin";
        String tamAd=topla(ad,soyad);
        System.out.println("tamAd = " + tamAd);

        int s1=4;
        int s2=5;
        int toplam=topla(s1,s2);
        System.out.println("toplam = " + toplam);


    }
    public static String topla(String a,String b){
        return a+" "+b;
    }
    public static int topla(int a, int b){
        return a+b;
    }
}
