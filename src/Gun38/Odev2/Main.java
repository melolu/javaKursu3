package Gun38.Odev2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TxtFile txt=new TxtFile();
        PowerPointFile ppt=new PowerPointFile();
        DMGFile dmg=new DMGFile();
        EXEFile exe=new EXEFile();

        ArrayList<ReadFile> dosya=new ArrayList<>();
        dosya.add(txt);
        dosya.add(ppt);
        dosya.add(dmg);
        dosya.add(exe);

        for (ReadFile d: dosya){
            System.out.println(d.getClass().getSimpleName());
            System.out.println("d.open() = " + d.open());
            System.out.println("d.read() = " + d.read());
            System.out.println("d.save() = " + d.save());
            System.out.println("d.close() = " + d.close());
            System.out.println();
        }
    }
}
