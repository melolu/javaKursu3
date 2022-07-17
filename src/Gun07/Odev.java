package Gun07;

import java.util.Locale;
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        String str="paper";
        System.out.println("\"paper\" buyuk yazdir = " + str.toUpperCase());

        String str2="OraNge";
        System.out.println("\"OraNge\" ifadesini kucuk yazdir = " + str2.toLowerCase());

        String str3="New Jersey";
        System.out.println("\"New Jersey\"buyuk yazdir = " + str3.toUpperCase());

        String str4="New York";
        System.out.println("\"New York\" kucuk yazdir = " + str4.toLowerCase());

        String str5="PADDLE";
        System.out.println("\"PADDLE\"kucuk yazdir = " + str5.toLowerCase());

        String str6="apple";
        System.out.println("\"apple\" ifadesi 'app' iceriyor mu? = " + str6.contains("app"));

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cumle giriniz=");
        String cumle= oku.nextLine();
        int cumleUzunluk=cumle.length();
        String bosluksuzCumle=cumle.replace(" ","");
        int bosluksuzUzunluk=bosluksuzCumle.length();
        System.out.println("Cumledeki kelime sayisi = " + (cumleUzunluk-bosluksuzUzunluk+1));

        //Girilen bir cumledeki kelimeleri ilk harflerini hazdırınız

        System.out.print("Bir cumle giriniz=");
        String cumle2= oku.nextLine();
        System.out.println("girilen cumledeki kelimelerin bas harfleri = "+ cumle2.replaceAll("\\B\\w",""));

        // \s regex ifadede bosluklari bulur
        // \b\w ilk harfleri verir



    }
}
