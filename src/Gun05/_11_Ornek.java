package Gun05;

import java.util.Scanner;

public class _11_Ornek {
    public static void main(String[] args) {
        //kullanicidan cadde, sokak, postakodu(int) ve ulke seklinde adres bilgisi alarak yaziniz
        Scanner oku=new Scanner(System.in);
        System.out.print("Cadde:"); String cadde= oku.nextLine();
        System.out.print("Sokak:"); String sokak= oku.nextLine();
        Scanner oku2=new Scanner(System.in);
        System.out.print("Posta Kodu:"); int pkodu= oku2.nextInt();
        System.out.print("Ulke:"); String ulke= oku.nextLine();
    }
}
