package Gun19;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // 2 boyutlu 3x4 diziyi random 1-10 arasi sayilarla doldurup baska dongude yazdiriniz
        int[][] dizi=new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                dizi[i][j]=(int)(Math.random()*9+1);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(dizi[i][j]+"\t"); //System.out.print("dizi["+i+"]["+j+"]= " + dizi[i][j]+"\t");

            }
            System.out.println();
        }
    }
}
