public class Employee implements Salary,Bonus{


    private String firstName;
    private String lastName;
    private int age;
    private double hourlyWage;

    public Employee(String firstName, String lastName, int age, double hourlyWage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage*hours;
    }



    @Override
    public double calculateBonus() {
        return calculateSalary()+1000;
    }
}
