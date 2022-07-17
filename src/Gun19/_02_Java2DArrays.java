package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo1=new int[2][3];
        int[][] tablo2={{23,44,55},{50,60,70}};
        int toplam=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + "," + j + " = " + tablo2[i][j]);

                toplam=toplam+tablo2[i][j];
            }
        }
        System.out.println("toplam = " + toplam);

    }
}
