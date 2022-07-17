package Gun30.Soru1;

public class Hesap {
    int yatan=0;
    int cekilen=0;
    private int bakiye=0;



    public void paraYatir(int yatanPara){
        this.bakiye=bakiye+yatanPara;
        this.yatan=yatan+yatanPara;
    }
    public void paraCek(int cekilenPara){
        if (cekilen>this.bakiye)
            System.out.println("Bakiye yetersiz");
        else {
            this.bakiye = bakiye - cekilenPara;

            this.cekilen = cekilen + cekilenPara;
        }
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
