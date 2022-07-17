package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {
    public P2Kedi(String ad,String cinsi) {
        super.ad=ad; //kendi classi olsa this.ad diyecektik, ust classtan
        //oldugu icin super.ad dedik
        super.cinsi=cinsi;
    }

    @Override
    public String toString() {
        return "P2Kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                "} ";
    }
}
