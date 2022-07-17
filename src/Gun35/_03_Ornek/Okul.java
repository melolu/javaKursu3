package Gun35._03_Ornek;

public class Okul {
    public static void main(String[] args) {

        LiseOgrencisi ogr1=new LiseOgrencisi("melih","MF",Sinif.LISE);
        LiseOgrencisi ogr2=new LiseOgrencisi("sebnem","TM",Sinif.LISE);

        IlkOgrencisi ogr3=new IlkOgrencisi("anil",Sinif.ILK,"tiyatro");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);
    }
}
