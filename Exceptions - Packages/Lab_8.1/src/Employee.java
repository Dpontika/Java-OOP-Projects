
public class Employee {
    private String name;
    private String birthDate; // Format: DDMMYYYY
    private int[] workingHours; // Array for 12 months
    private int[] overtime;    // Array for 12 months
    private double dayWage;
    private int childNo;
    private double bonusFactor;

    // Constructor
    public Employee(String name, String birthDate, double dayWage, int childNo)
            throws IllegalArgumentException, InvalidBirthDateException {
        this.name = name;
        setBirthDate(birthDate);
        this.dayWage = dayWage;
        setChildNo(childNo);

        // Initialize arrays for 12 months
        this.workingHours = new int[12];
        this.overtime = new int[12];
    }


    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getDayWage() {
        return dayWage;
    }

    public int getChildNo() {
        return childNo;
    }

    public double getBonusFactor() {
        return bonusFactor;
    }

    // Mutator methods (setters)
    public void setName(String name) {
        this.name = name;
    }


    public void setBirthDate(String birthDate) throws InvalidBirthDateException {
        // Check birthdate format (DDMMYYYY)
        if (birthDate.length() != 8) {
            throw new InvalidBirthDateException("Birth date must be 8 digits (DDMMYYYY)");
        }

        try {
            int day = Integer.parseInt(birthDate.substring(0, 2));
            int month = Integer.parseInt(birthDate.substring(2, 4));
            int year = Integer.parseInt(birthDate.substring(4, 8));

            if (day < 1 || day > 31) {
                throw new InvalidBirthDateException("Day must be between 1-31");
            }
            if (month < 1 || month > 12) {
                throw new InvalidBirthDateException("Month must be between 1-12");
            }

            this.birthDate = birthDate;
        } catch (NumberFormatException e) {
            throw new InvalidBirthDateException("Birth date must contain only digits");
        }
    }

    public void setChildNo(int childNo) throws IllegalArgumentException {
        if (childNo < 0) {
            throw new IllegalArgumentException("Number of children cannot be negative");
        }
        this.childNo = childNo;
    }

    public void setDayWage(double dayWage) {
        this.dayWage = dayWage;
    }

    // Set working hours for a specific month
    public void setWorkingHours(int month, int hours) {
        if (month < 0 || month >= workingHours.length) {
            throw new ArrayIndexOutOfBoundsException("Month must be between 0-11");
        }
        workingHours[month] = hours;
    }

    // Set overtime for a specific month
    public void setOvertime(int month, int hours) {
        if (month < 0 || month >= overtime.length) {
            throw new ArrayIndexOutOfBoundsException("Month must be between 0-11");
        }
        overtime[month] = hours;
    }

    //Calculate salary: (workingHours + overtime) * dayWage * (1 + bonusFactor)

    public double calcSalary(int month) {
        try {
            // Calculate bonus factor first
            calcBonusFactor();

            int totalHours = workingHours[month] + overtime[month];
            return totalHours * dayWage * (1 + bonusFactor);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid month index: " + e.getMessage());
            return 0;
        }
    }


    // Calculate bonus factor: 100 - (50 / childNo)

    public void calcBonusFactor() {
        try {
            if (childNo == 0) {
                throw new ArithmeticException("Cannot divide by zero - employee has no children");
            }
            bonusFactor = (100 - (50.0 / childNo)) / 100.0; // Convert to decimal
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
            bonusFactor = 0; // Default value when no children
        }
    }


    public void printWorkingHours() {
        System.out.println("Working hours per month:");
        try {
            for (int i = 0; i < workingHours.length; i++) {
                System.out.println("Month " + (i + 1) + ": " + workingHours[i] + " hours");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bounds: " + e.getMessage());
        }
    }

    public void employeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Day Wage: " + dayWage);
        System.out.println("Children: " + childNo);
        System.out.println("Bonus Factor: " + bonusFactor);
    }

    //Calculate total overtime and check for exceptions

    public void calculateTotalOvertime() {
        try {
            int totalOvertime = 0;
            for (int hours : overtime) {
                totalOvertime += hours;
            }

            if (totalOvertime > 120) {
                throw new InvalidHoursException("Too many hours: " + totalOvertime);
            } else if (totalOvertime < 0) {
                throw new InvalidHoursException("Overtime cannot be negative");
            }

            System.out.println("Total overtime: " + totalOvertime + " hours");

        } catch (InvalidHoursException e) {
            System.out.println("Invalid Hours Exception: " + e.getMessage());
        } finally {
            System.out.println("End of calculation");
        }
    }

    // Get working hours for a specific month
    public int getWorkingHours(int month) {
        return workingHours[month];
    }

    // Get overtime for a specific month
    public int getOvertime(int month) {
        return overtime[month];
    }
}