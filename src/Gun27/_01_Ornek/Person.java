package Gun27._01_Ornek;

public class Person {
    String name;
    String surname;
    int age;

    public void BilgiYazdir(){
        System.out.println("name = " + name);
        System.out.println("surname = " + surname);
        System.out.println("age = " + age);
    }
    public void getBirthYear(){
        System.out.println("Dogum yili = " +(2022-age));
    }
    public void getInitials(){
        System.out.println(name.toUpperCase().charAt(0)+"."+surname.toUpperCase().charAt(0)+".");
    }
}

