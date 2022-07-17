package Gun32._02_Ornek;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.
    public static void main(String[] args) {
        User user1=new User("melih",Statu.AKTIF,Rol.ADMIN);
        User user2=new User("anil",Statu.PASIF,Rol.PERSONEL);
        User user3=new User("senem",Statu.AKTIF,Rol.MUDUR);
    }

    public static void UserSil(User user){
        if (user.rol==Rol.ADMIN){
            System.out.println("admin silinemez");
        }

    }
}
