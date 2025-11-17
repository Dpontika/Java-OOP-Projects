

public class Employee {
    protected String name;          // name
    protected String id;            // employee ID
    protected String specialty;     // specialty
    protected String address;       // address

    // Constructor
    public Employee(String name, String id, String specialty, String address) {
        this.name = name;
        this.id = id;
        this.specialty = specialty;
        this.address = address;
    }

    // Method to calculate salary (to be overridden by subclasses)
    public double calculateSalary() {
        return 0; // Base implementation returns 0
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee: " + name +
                "\nID: " + id +
                "\nSpecialty: " + specialty +
                "\nAddress: " + address;
    }
}