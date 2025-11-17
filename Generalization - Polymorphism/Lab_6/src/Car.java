
/**
 * Car class - extends Vehicle
 * Represents a car with specific number of doors
 */

public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor
    public Car(String owner, String licensePlate, int manufacturingYear, int numberOfDoors) {
        super(owner, licensePlate, manufacturingYear);
        this.numberOfDoors = numberOfDoors;
    }

    // Method for car behaviour
    @Override
    public void drive() {
        System.out.println("You need a car driving license dear " + owner);
    }

    // Car-specific method
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    // Display method to include car-specific info
    @Override
    public void displayInfo() {
        System.out.println("=== CAR INFORMATION ===");
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Type: Car");
        System.out.println("---------------------------");
    }
}