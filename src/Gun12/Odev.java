package Gun12;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
//        1- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
//        bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.
        Scanner scan=new Scanner(System.in);

        System.out.print("ondalikli bir sayinin tam sayi kismini giriniz=");
        String tamKismi=scan.next();
        System.out.print("ondalikli bir sayinin ondalik kismini giriniz=");
        String ondalikKismi=scan.next();
        int tamSayi=Integer.parseInt(tamKismi);
        int ondalikSayi=Integer.parseInt(ondalikKismi);
        System.out.println("tek bir ondalikli sayi hali="+tamSayi+"."+ondalikSayi);


//        2- Girilen bir sayı Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
//        Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
        System.out.print("bir sayi giriniz=");
        int sayi= scan.nextInt();
        if (sayi%9==0 && sayi%5==0){
            System.out.println("Able to divide by 9 and 5");
        }
        else {
            if (sayi%4==0 && sayi%5==0)
                System.out.println("Able to divide by 4 and 5");
            else
                System.out.println("sonuc yok");
        }

//        3- Girilen 3 sayıdan en küçük olanını bulunuz.
        System.out.print("3 sayidan birinci sayiyi giriniz=");
        int sayi1= scan.nextInt();
        System.out.print("3 sayidan ikinci sayiyi giriniz=");
        int sayi2= scan.nextInt();
        System.out.print("3 sayidan ucuncu sayiyi giriniz=");
        int sayi3= scan.nextInt();
        System.out.println("girilen 3 sayidan en kucugu="+Math.min(sayi1,Math.min(sayi2,sayi3)));


//        4-Girilen bir string Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
//        Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
//        Aksi halde (else) "no money" yazdırın.
        System.out.print("bir string ifade yaziniz=");
        String string=scan.nextLine();
        if (string.contains("€")){
            System.out.println("This is euro");
        }
        else {
            if (string.contains("$")){
                System.out.println("This is dollar");
            }
            else
                System.out.println("no money");
        }

//        5-Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
//        Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
//        Eğer ortalama not >=90 =>not=A
//        Eğer ortalama not >= 70 ve<90 => not=B
//        Eğer ortalama not >=50 ve <70 =>not=C
//        Eğer ortalama not <50 =>note=F
//        Aşağıdaki örnek çıktıya bakın:
//        int Quiz_score: 80 int mid_term_score: 68 int Final_score: 90
//        print (Your grade is B)
//        (Notunuz B'dir)
        System.out.print("quiz notunuzu giriniz=");
        int quiz=scan.nextInt();
        System.out.print("vize notunuzu giriniz=");
        int vize= scan.nextInt();
        System.out.print("final notunuzu giriniz=");
        int finalNotu= scan.nextInt();
        double ortalama=(quiz+vize+finalNotu)/3;

        if (ortalama>=90){
            System.out.println("harf notu=A");
        }
        else {
            if (ortalama>=70){
                System.out.println("harf notu=B");
            }
            else {
                if (ortalama>=50){
                    System.out.println("harf notu=C");
                }
                else
                    System.out.println("harf notu=F");
            }
        }

    }
}
