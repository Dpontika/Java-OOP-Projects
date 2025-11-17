
public abstract class Vehicle {
    protected String owner;
    protected String licensePlate;
    protected int manufacturingYear;

    // Constructor
    public Vehicle(String owner, String licensePlate, int manufacturingYear) {
        this.owner = owner;
        this.licensePlate = licensePlate;
        this.manufacturingYear = manufacturingYear;
    }

    public void transferOwnership(String newOwner) {
        System.out.println("Ownership is transferred from " + owner + " to " + newOwner);
        this.owner = newOwner;
    }

    public abstract void drive();

    // Getters and Setters
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Manufacturing Year: " + manufacturingYear);
    }
}