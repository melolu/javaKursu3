package Gun15;

import java.util.Scanner;

public class Odev5_1 {
    public static void main(String[] args) {
        //5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.print("sayi girin=");
        int sayi= scan.nextInt();
        int ilkBasamak=sayi%10;
        int sonBasamak=0;

        while (sayi>9){
            sayi=sayi/10;
        }
        sonBasamak=sayi;

        if (ilkBasamak==sonBasamak)
            System.out.println("ilk ve son basamak esit");
        else System.out.println("esit degil");
    }
}
