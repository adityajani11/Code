class Employee {
    // Instance variables
    private String id;
    private String name;
    private double monthlySalary;

    // Default constructor
    public Employee() {
        this.id = "";
        this.name = "";
        this.monthlySalary = 0.0;
    }

    // Constructor with parameters
    public Employee(String id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Getter and setter methods for id
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Getter and setter methods for name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Getter and setter methods for monthlySalary
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: $" + monthlySalary);
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Method to give a 10% raise
    public void giveRaise() {
        this.monthlySalary = this.monthlySalary * 1.10;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("E01", "Aditya", 5000.00);
        Employee emp2 = new Employee("E02", "Adi", 4000.00);

        // Display each employee's yearly salary
        System.out.println("Employee 1 Details:");
        emp1.displayEmployee();
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployee();
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());

        // Give each employee a 10% raise
        emp1.giveRaise();
        emp2.giveRaise();

        // Display each employee's yearly salary after the raise
        System.out.println("\nAfter 10% Raise:");

        System.out.println("Employee 1 Details:");
        emp1.displayEmployee();
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployee();
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());
    }
}