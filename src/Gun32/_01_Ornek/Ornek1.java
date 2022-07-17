package Gun32._01_Ornek;

public class Ornek1 {
    //verilen bir ayNo'ya gore girilen ayin kac gun surdugunu bulunuz
    public static void main(String[] args) {
        int ayNo=5;

        switch (ayNo){
            case 2: System.out.println(28); break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: System.out.println(31); break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println(30); break;

        }
    }
}
