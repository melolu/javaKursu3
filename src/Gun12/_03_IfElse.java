package Gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        //otopark ucretleri: 3saate kadar 10 tl, 5 saate kadar 15tl, 5 saatten fazlaysa 20tldir
        //kullanicidan kac saat kaldigini alarak ucreti ekrana yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.print("kac saat kaldiniz? :");
        int saat= scan.nextInt();

        if (saat<3){
            System.out.println("ucret=10 tl");
        }
        else {
            if (saat<5){
                System.out.println("ucret=15tl");
            }
            else {
                System.out.println("ucret=20tl");
                }
            }
        }
    }
