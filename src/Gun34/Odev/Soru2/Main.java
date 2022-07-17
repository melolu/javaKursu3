package Gun34.Odev.Soru2;

public class Main {
    public static void main(String[] args) {
        Employees emp1 = new Employees("fernando", 80000, "11/23/2000");
        ageCalculator(2000);
        if (ageCalculator(2000)>18){
            System.out.println("Welcome to our company Fernando your salary is 80000");

        }
        else if (ageCalculator(2000)<18){
            System.out.println("come back when you are 18 years old.");
        }
        else System.out.println("we can have inter with you after that you can have a 80000 salary");

    }
    static int ageCalculator(int yearofBirth){
      return   2022-yearofBirth;
    }
}
