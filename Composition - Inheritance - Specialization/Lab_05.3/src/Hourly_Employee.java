/**
 * Subclass representing an hourly paid employee
 * Inherits from Employee
 */

public class Hourly_Employee extends Employee {

    private int hours;  // hours worked

    // Constants
    private static final double hourly_wage = 7.0; // 7€ per hour
    private static final double bonus = 0.06;      // 6% bonus on base salary

    // Constructor
    public Hourly_Employee(String name, String id, String speciality,
                       String address, int hours) {
        super(name, id, speciality, address);
        this.hours = hours;
    }

    // Override salary calculation method
    @Override
    public double calculateSalary() {
        double baseSalary = hours * hourly_wage;
        double productivityBonus = baseSalary * bonus;
        return baseSalary + productivityBonus;
    }

    // Getter and Setter
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nType: Hourly Employee" +
                "\nHours Worked: " + hours +
                "\nMonthly Salary: " + String.format("%.2f", calculateSalary()) + "€";
    }
}
