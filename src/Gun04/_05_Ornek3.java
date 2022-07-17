package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // kisinin agirligini double, boyunu int olarak degerler veriniz
        // bir satirda boyunuz ... ve kilonuz ... seklinde yaziniz.
        // ve vucut kitle indeksini hesaplayiniz (kilo/boy*boy)

        double kilonuz=80;
        double boyunuz=1.77;

        double kitleIndex= kilonuz/(boyunuz*boyunuz);


        System.out.println("Boyunuz "+boyunuz+" m "+"ve "+"kilonuz"+" "+kilonuz+" kg'dir");
        System.out.println("Vucut kitle indeksiniz="+kitleIndex);

        }
    }
