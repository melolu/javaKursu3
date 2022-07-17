package Gun38.Odev4;

import java.util.ArrayList;

public interface deliveryOptions {
     int getTheTotal(ArrayList<String> a);
     String isFreeShipping(ArrayList<String> b);

     int amazonMinFreeDelivery=10000;
     int costcoMinFreeDelivery=15000;

}
