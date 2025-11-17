/**
 * Subclass representing a salaried employee
 * Inherits from Employee
 */

public class Salaried_Employee extends Employee {
    private int children;  // number of children
    private int xp; // years of experience

    // Constants
    private static final double base_salary = 700.0;
    private static final double child_allowance = 0.05;  // 5% bonus on base salary for each child
    private static final double xp_bonus = 0.10;         // 10% bonus on base salary for every 3 years of experince

    // Constructor
    public Salaried_Employee(String name, String id, String speciality,
                             String address, int children, int xp) {
        super(name, id, speciality, address);
        this.children = children;
        this.xp = xp;
    }

    // Override salary calculation method
    @Override
    public double calculateSalary() {
        double baseSalary = base_salary;
        double childAllowance = baseSalary * (child_allowance * children);
        int xp_3 = xp / 3; // number of 3-year periods
        double xpBonus = baseSalary * (xp_bonus * xp_3);

        return baseSalary + childAllowance + xpBonus;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nType: Salaried Employee" +
                "\nChildren: " + children +
                "\nYears of Experience: " + xp +
                "\nMonthly Salary: " + String.format("%.2f", calculateSalary()) + "€";
    }
}
