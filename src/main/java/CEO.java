public abstract class CEO implements Salary {
    private String firstName;
    private String lastName;
    private int age;
    private double hourlyWage;

    public CEO(String firstName, String lastName, int age, double hourlyWage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }


    }

