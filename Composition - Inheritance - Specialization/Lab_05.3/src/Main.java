/**
 * Main class
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== EMPLOYEE INHERITANCE SYSTEM ===");

        // Create 4 employees and 2 managers (2 of each type)
        Employee[] employees = createEmployees();

        // Display all employees
        displayAllEmployees(employees);

        // Display total payroll
        displayTotalPayroll(employees);

        // Display employee type statistics
        displayEmployeeStatistics(employees);
    }


    // Creates and returns an array of 4 employees and 2 managers (2 of each type)
    private static Employee[] createEmployees() {
        Employee[] employees = new Employee[6];

        // Hourly employees
        employees[0] = new Hourly_Employee("Justin Timberlake", "EMP001", "Technician",
                "Beverly Hills, 6212", 145);
        employees[1] = new Hourly_Employee("Malika Andrews", "EMP002", "Assistant",
                "Easton Highs, 7898", 175);

        // Salaried employees
        employees[2] = new Salaried_Employee("Roberto Carlos", "EMP003", "Accountant",
                "Sao Paolo. 4658", 3, 5);
        employees[3] = new Salaried_Employee("Kobe Bryant", "EMP004", "Engineer",
                "Los Angeles, 0824", 2, 8);

        // Managers
        employees[4] = new Manager("Rupert Murdoch", "EMP005", "Department Head",
                "UNDISCLOSED", 3, 12);
        employees[5] = new Manager("Elon Musk", "EMP006", "Team Leader",
                "UNDISCLOSED", 0, 6);

        System.out.println("4 employees and 2 managers created successfully!");
        return employees;
    }

    // Displays all

    private static void displayAllEmployees(Employee[] employees) {
        System.out.println("\n=== ALL EMPLOYEES ===");
        for (int i = 0; i < employees.length; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.println(employees[i]);
            System.out.println("---------------------------");
        }
    }

    // Calculates and displays the total payroll

    private static void displayTotalPayroll(Employee[] employees) {
        double totalPayroll = 0;
        for (Employee employee : employees) {
            totalPayroll += employee.calculateSalary();
        }
        System.out.println("\n=== PAYROLL SUMMARY ===");
        System.out.printf("Total Monthly Payroll: %.2f€\n", totalPayroll);
    }

    // Displays statistics about employee types

    private static void displayEmployeeStatistics(Employee[] employees) {
        int hourlyCount = 0;
        int salariedCount = 0;
        int managerCount = 0;

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                managerCount++;
            } else if (employee instanceof Salaried_Employee) {
                salariedCount++;
            } else if (employee instanceof Hourly_Employee) {
                hourlyCount++;
            }
        }

        System.out.println("\n=== EMPLOYEE STATISTICS ===");
        System.out.println("Hourly Employees: " + hourlyCount);
        System.out.println("Salaried Employees: " + salariedCount);
        System.out.println("Managers: " + managerCount);
        System.out.println("Total Employees: " + employees.length);
    }
}