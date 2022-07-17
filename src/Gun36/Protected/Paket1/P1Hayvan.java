package Gun36.Protected.Paket1;

public class P1Hayvan {
    public String ad; //her paketten kullanilir
    int yas; //default sadece kendi paketinde kullanilir
    protected String cinsi; //default ile ayni ek bir ozelligi var
    //extends yaparsan ulasilabilir olur
    private String renk;
}
