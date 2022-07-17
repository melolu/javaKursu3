package Gun10;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayinin birler basamagini yazi ile yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();

        if (sayi%10==0){
            System.out.print("birler basamagi=sifir");
        }
        if (sayi%10==1){
            System.out.print("birler basamagi=bir");
        }
        if (sayi%10==2){
            System.out.print("birler basamagi=iki");
        }
        if (sayi%10==3){
            System.out.print("birler basamagi=uc");
        }
        if (sayi%10==4){
            System.out.print("birler basamagi=dort");
        }
        if (sayi%10==5){
            System.out.print("birler basamagi=bes");
        }
        if (sayi%10==6){
            System.out.print("birler basamagi=alti");
        }
        if (sayi%10==7){
            System.out.print("birler basamagi=yedi");
        }
        if (sayi%10==8){
            System.out.print("birler basamagi=sekiz");
        }
        if (sayi%10==9){
            System.out.print("birler basamagi=dokuz");
        }

    }
}
