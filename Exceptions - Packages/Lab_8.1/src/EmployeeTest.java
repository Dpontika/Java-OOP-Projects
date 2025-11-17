
public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("=== EMPLOYEE EXCEPTION HANDLING TEST ===");

        // Test 1: Valid employee creation
        System.out.println("\n--- Test 1: Valid Employee ---");
        try {
            Employee emp1 = new Employee("Sifis Sifakis", "15051985", 50.0, 2);
            emp1.setWorkingHours(0, 160); // January
            emp1.setOvertime(0, 10);
            emp1.employeeInfo();
            emp1.printWorkingHours();
            System.out.println("January Salary: " + emp1.calcSalary(0));
            emp1.calculateTotalOvertime();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2: Invalid birthdate
        System.out.println("\n--- Test 2: Invalid Birth Date ---");
        try {
            Employee emp2 = new Employee("Babis Sougias", "35152000", 50.0, 1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 3: Negative children
        System.out.println("\n--- Test 3: Negative Children ---");
        try {
            Employee emp3 = new Employee("Makis Mamalakis", "01011990", 50.0, -1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 4: No children (division by zero)
        System.out.println("\n--- Test 4: No Children ---");
        try {
            Employee emp4 = new Employee("Nike Patras", "20061988", 50.0, 0);
            emp4.setWorkingHours(0, 160);
            emp4.setOvertime(0, 5);
            System.out.println("January Salary: " + emp4.calcSalary(0));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 5: Array index out of bounds
        System.out.println("\n--- Test 5: Array Index Out of Bounds ---");
        try {
            Employee emp5 = new Employee("Charlie Brown", "10101980", 50.0, 3);
            emp5.setWorkingHours(12, 160); // Invalid month
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 6: Too many overtime hours
        System.out.println("\n--- Test 6: Excessive Overtime ---");
        try {
            Employee emp6 = new Employee("Diana White", "05051975", 50.0, 2);
            // Set high overtime for several months
            for (int i = 0; i < 6; i++) {
                emp6.setOvertime(i, 25); // 25 hours overtime per month
            }
            emp6.calculateTotalOvertime();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}