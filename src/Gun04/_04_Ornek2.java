package Gun04;

public class _04_Ornek2 {
    public static void main(String[] args) {
        // 1 tane double ve 1 tane short degisken tanimlayiniz
        // deger atayiniz sonra double degiskeni short degiskene cevirerek butun degerleri ekrana yazdiriniz

        short kisaDeger=12;
        double uzunDeger=188.245;

        kisaDeger=(short)uzunDeger;
        System.out.println("kisaDeger = " + kisaDeger);
        System.out.println("uzunDeger = " + uzunDeger);


    }
}
