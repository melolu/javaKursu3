package Gun17;

public class Odev {
    public static void main(String[] args) {
        //1 String array oluşturun ve elemanları : Apple , Orange , Banana ,Pineapple Apple elemanının
        // bu Array'a ait olup olmadığını kontrol edin.Eğer aitse "true" çevirin.

        String[] dizi={"Apple","Orange","Banana","Pineapple"};
        for (int i = 0; i < dizi.length; i++) {


            while (dizi[i].equals("Apple")) {
                System.out.println("true");
                break;
            }
        }
    }
}
