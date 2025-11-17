/**
 * Motorcycle class - extends Vehicle
 * Represents a motorcycle
 */

public class Motorcycle extends Vehicle {
    private boolean hasSidecar; //Indication if the motorcycle has a sidecar

    // Constructor
    public Motorcycle(String owner, String licensePlate, int manufacturingYear, boolean hasSidecar) {
        super(owner, licensePlate, manufacturingYear);
        this.hasSidecar = hasSidecar;
    }

    // Method for motorcycle behaviour
    @Override
    public void drive() {
        System.out.println("Your car driving license is not enough. You need a special license dear " + owner);
    }

    // Motorcycle-specific method
    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    // Display method to include motorcycle-specific info
    @Override
    public void displayInfo() {
        System.out.println("=== MOTORCYCLE INFORMATION ===");
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
        System.out.println("Type: Motorcycle");
        System.out.println("---------------------------");
    }
}