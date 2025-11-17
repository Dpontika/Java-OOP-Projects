// Represents a Vehicle with composition of Engine and Driving System

public class Vehicle {
    private String owner;      // owner's name
    private String licence_num;    // license number
    private int year;             // manufacturing year
    private DrivingSystem driv_sys;  // driving system (composition)
    private Engine eng;              // engine (composition)

    // Constructor
    public Vehicle(int year, DrivingSystem driv_sys, Engine eng) {
        this.year = year;
        this.driv_sys = driv_sys;
        this.eng = eng;
    }

    // Getters and Setters
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLicence_num() {
        return licence_num;
    }

    public void setLicence_num(String licence_num) {
        this.licence_num = licence_num;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public DrivingSystem getDriv_sys() {
        return driv_sys;
    }

    public void setDriv_sys(DrivingSystem driv_sys) {
        this.driv_sys = driv_sys;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }

    // Display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Owner: " + owner);
        System.out.println("License Plate: " + licence_num);
        System.out.println("Manufacturing Year: " + year);
        System.out.println("Engine Capacity: " + eng.getCc() + "cc");
        System.out.println("Horsepower: " + eng.getHp() + "hp");
        System.out.println("---------------------------");
    }

    // Driving system operations
    public void demonstrateDriving() {
        System.out.println("Demonstrating driving operations:");
        driv_sys.engineOn();
        driv_sys.turnLeft();
        driv_sys.turnRight();
        driv_sys.engineOff();
    }

    // Engine operations
    public void demonstrateEngine() {
        System.out.println("Demonstrating engine operations:");
        eng.starting();
        eng.running();
        eng.shutDown();
    }
}