package Gun29.OzelSorular2.Soru10;

public class Main {
    public static void main(String[] args) {
        String[][] arr={{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
        int sayi=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    sayi = Integer.parseInt(arr[i][j].replaceAll("[^\\d]", ""));
                    double dsayi = sayi * 3.2;
                } else if (arr[i][j].contains("€")) {
                    sayi = Integer.parseInt(arr[i][j].replaceAll("[^\\d]", ""));
                    double dsayi = sayi * 4.2;
                }
            }
        }
    }
}
