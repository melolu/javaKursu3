package Gun21;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba dunya");

        merhabaYaz(); //giden yok, donen yok
        toplamYaz(4,5); //giden 4,5, donen yok
        int enb1=Math.max(4,5); //giden 4,5, donen 5

        enbYaz(4,5);
        int enb=enbBul(4,5);
        System.out.println("enb = " + enb);
    }
    public static int enbBul(int s1, int s2){
        int enb=s1;
        if (s2>s1)
            enb=s2;

        return enb;
    }
    public static void enbYaz(int s1,int s2){
        if (s1>s2)
            System.out.println(s1);
        else System.out.println(s2);
    }
    public static void merhabaYaz(){
        System.out.println("Merhaba Dunya");
    }
    public static void toplamYaz(int s1, int s2){
        System.out.println(s1+s2);
    }
}
