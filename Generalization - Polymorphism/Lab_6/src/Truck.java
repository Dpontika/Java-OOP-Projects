
/**
 * Truck class - extends Vehicle
 * Represents a truck with specific number of axles
 */

public class Truck extends Vehicle {
    private int numberOfAxles;

    // Constructor
    public Truck(String owner, String licensePlate, int manufacturingYear, int numberOfAxles) {
        super(owner, licensePlate, manufacturingYear);
        this.numberOfAxles = numberOfAxles;
    }

    // Method for truck behaviour
    @Override
    public void drive() {
        System.out.println("You must be a professional driver. This is a " +
                numberOfAxles + " axles truck Mr. " + owner);
    }

    // Truck-specific method
    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    // Display method to include truck-specific info
    @Override
    public void displayInfo() {
        System.out.println("=== TRUCK INFORMATION ===");
        super.displayInfo();
        System.out.println("Number of Axles: " + numberOfAxles);
        System.out.println("Type: Truck");
        System.out.println("---------------------------");
    }
}