package Gun34.Odev.Soru2;

public class Employees {
    private String name;
    private int salary;
    private String dateOfBirth;
    public Employees(String name, int salary, String dateOfBirth) {
        setName(name);
        setSalary(salary);
        setDateOfBirth(dateOfBirth);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
