package Gun30.PrivateErisim;

public class Calisan {
    int id;
    String name;
    String surName;
    private String password="";

    public void sifreAta(String sifre){
        if (sifre.length()<8)
            System.out.println("Sifre kisa");
        else
            this.password=sifre;
        System.out.println("Sifre basariyla atandi");
    }

    public void sifreGoster(){
        if (password.length() >=8)
        System.out.println("****"+ password.substring(4));
    }
}
