package Gun29._03_Constructor;

public class Banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public Banka(){

    }
//sag tikla, generate,constructor, istedigin parametreleri sec asagidaki gibi olussun
    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }

    public Banka(int subeSayisi,int kurulusYili) {
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

//sag tikla, generate, toString tikla, parametreleri sec, asagidaki gibi olussun
    @Override
    public String toString() {
        return "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }

}
