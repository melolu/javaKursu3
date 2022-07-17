package Gun19;

public class _04_Tablo {
    public static void main(String[] args) {
        //{{1,2,3},{2,3,1},{5,5,5},{2,10,3}} int arrayini olustur
        //arrayin max number print et
        int[][] dizi={{1,2,3},{2,3,1},{5,5,5},{2,10,3}};
        int maxNum=dizi[0][0];
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) { //j<3 yerine j<tablo[i].lenght yaziyoruz artik
                if (dizi[i][j]>maxNum){
                    maxNum=dizi[i][j];
                }
            }
        }
        System.out.println("maxNum = " + maxNum);
    }
}
