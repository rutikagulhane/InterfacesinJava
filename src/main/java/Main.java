public class Main {
    public static void main(String[] args) {

        Employee employee=new Employee("Rutika","Gulhane",30,30);
        System.out.println("The Salary of the employee is "+employee.calculateSalary());
        System.out.println("Total salary including bonus is :"+employee.calculateBonus());

    }
}
