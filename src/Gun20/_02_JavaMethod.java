package Gun20;

public class _02_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dunya");

        MerhabaDunya(); //fonksiyon olusturduk ve bunu main icerisine cagirdik
    }
    public static void MerhabaDunya(){ //main disinda fonksiyon(metod) olusturduk, main oncesinde de olusturabiliriz
        System.out.println("Fonksiyonda Merhaba Dunya");
    }
    //metodlar tekrarlayan kodlardan kurtulup bir kere yazip sonra tekrar cagirmak icin ve buyuk programi parcalara
    //bolup kod karisikliginin onune gecmek icin kullanilir(temiz kod icin)
}
