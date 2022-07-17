package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //girilen vize %40 ve final %60 notunu okuyarak ortalamayi bulunuz.
        //ortalama 60dan buyuk ise gectiniz, tebrikler yazdiriniz, degilse butunlemeye kaldiniz seklinde yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("vize notunu girin=");
        int vize= scan.nextInt();
        System.out.print("final notunu girin=");
        int finalexam= scan.nextInt();
        double ortalama=((vize*0.4)+(finalexam*0.6));

        if (ortalama>=60){
            System.out.println("gectiniz, tebrikler");
        }
        else {
            System.out.println("butunlemeye kaldiniz");
        }
    }
}
