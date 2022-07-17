package Gun04;

public class _08_Ornek5 {
    public static void main(String[] args) {
        //string olarak verilen 2 adet bagis parasinin toplamini yazdiriniz
        String bagis1="500";
        String bagis2="1500";

        int intBagis1=Integer.parseInt(bagis1);
        int intBagis2=Integer.parseInt(bagis2);

        int toplam=intBagis1+intBagis2;
        System.out.println("toplam = " + toplam);
    }
}
