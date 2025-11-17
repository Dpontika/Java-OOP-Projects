/**
 * Subclass representing a manager
 * Inherits from Salaried_Employee (which inherits from Employee)
 */
public class Manager extends Salaried_Employee {
    // Constants
    private static final double bonus = 0.10;  // 10% bonus on all income

    // Constructor
    public Manager(String name, String id, String speciality,
                   String address, int children, int xp) {
        super(name, id, speciality, address, children, xp);
    }

    // Override salary calculation method
    @Override
    public double calculateSalary() {
        double baseSalary = super.calculateSalary(); // Get salary from Salaried_Employee
        double managerBonus = baseSalary * bonus;
        return baseSalary + managerBonus;
    }

    @Override
    public String toString() {
        return super.toString().replace("Salaried Employee", "Manager") +
                "\n(Includes 10% manager bonus)";
    }
}