package Gun29.Odev;

import java.util.ArrayList;

public class UserMain {
    public static void main(String[] args) {
        ArrayList<User> kullanicilar=new ArrayList<>();
        User user1=new User("ahmet","132ahmet",true,true,Role.ADMIN);
        User user2=new User("mehmet","1234mehmet",false,true,Role.OGRENCI);
        User user3=new User("pelin","1234",true,false,Role.CALISAN);
        kullanicilar.add(user1);
        kullanicilar.add(user2);
        kullanicilar.add(user3);
        for (User u:kullanicilar){
            System.out.println("u = " + u);
        }
    }
}
