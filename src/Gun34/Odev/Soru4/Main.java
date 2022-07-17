package Gun34.Odev.Soru4;

public class Main {
    public static void main(String[] args) {
        rentApartments apt1=new rentApartments("melih",3,true);
        System.out.println(apt1.rentApartment(apt1.getRoomCount()));

        System.out.println(apt1.getName()+" rent is "+apt1.rentApartment(apt1.getRoomCount()));
    }
}
