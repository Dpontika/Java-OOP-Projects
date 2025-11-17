import java.util.Scanner;

public class VehicleMain {

    public static void main(String[] args) {
        System.out.println("=== VEHICLE POLYMORPHISM SYSTEM ===");

        // Get number of vehicles from command line or user
        int numberOfVehicles = getNumberOfVehicles(args);

        // Create array of vehicles using polymorphism
        Vehicle[] vehicles = createRandomVehicles(numberOfVehicles);

        // Display all vehicles
        displayAllVehicles(vehicles);

        // Demonstrate polymorphism with drive method
        demonstratePolymorphism(vehicles);

        // Demonstrate ownership transfer
        demonstrateOwnershipTransfer(vehicles);
    }

    private static int getNumberOfVehicles(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of vehicles to create: ");
        int n = scanner.nextInt();
        scanner.close();

        return n;
    }

    /**
     * Creates an array of random vehicles :
     * - 80% Cars
     * - 10% Trucks
     * - 10% Motorcycles
     */
    private static Vehicle[] createRandomVehicles(int numberOfVehicles) {
        Vehicle[] vehicles = new Vehicle[numberOfVehicles];

        System.out.println("\nCreating " + numberOfVehicles + " random vehicles...");
        System.out.println("Distribution: 80% Cars, 10% Trucks, 10% Motorcycles");

        for (int i = 0; i < numberOfVehicles; i++) {
            double random = Math.random(); // Returns value between 0.0 and 1.0

            if (random < 0.8) {
                // Create a Car (80%)
                vehicles[i] = createRandomCar(i);
            } else if (random < 0.9) {
                // Create a Truck (10%)
                vehicles[i] = createRandomTruck(i);
            } else {
                // Create a Motorcycle (10%)
                vehicles[i] = createRandomMotorcycle(i);
            }
        }

        return vehicles;
    }

    //Creates car data

    private static Car createRandomCar(int index) {
        String[] owners = {"Paul George", "Andy Garcia", "Julia Roberts", "Nicole Kidman", "George Clooney"};
        String[] carModels = {"Dodge", "Fiat", "Ford", "BMW", "Mercedes"};

        String owner = owners[(int)(Math.random() * owners.length)]; //Select a random owner
        String licensePlate = "CAR-" + (1000 + index);// Create licence plate
        int year = 2010 + (int)(Math.random() * 8); // Random year between 2010-2018
        int doors = (int)(Math.random() * 2) + 3; // Random 3 or 4 doors

        return new Car(owner, licensePlate, year, doors);
    }

    //Creates truck data

    private static Truck createRandomTruck(int index) {
        String[] owners = {"Dunder Mifflin", "Marc Jacobs", "Derrick Rose", "Kobe Bryant3"};
        String[] truckModels = {"Volvo", "Scania", "MAN", "Iveco"};

        String owner = owners[(int)(Math.random() * owners.length)]; //Select a random owner
        String licensePlate = "TRK-" + (2000 + index);// Create licence plate
        int year = 2015 + (int)(Math.random() * 3); // Random year between 2015-2018
        int axles = (int)(Math.random() * 3) + 2; // Random 2, 3, or 4 axles

        return new Truck(owner, licensePlate, year, axles);
    }

    //Creates motorcycle data

    private static Motorcycle createRandomMotorcycle(int index) {
        String[] owners = {"Tom Cruise", "Keanu Reeves", "Alex Cruise", "Diana Road"};
        String[] bikeModels = {"Yamaha", "Kawasaki", "Suzuki", "Harley-Davidson"};

        String owner = owners[(int)(Math.random() * owners.length)];
        String licensePlate = "MTC-" + (3000 + index); //Select a random owner
        int year = 2010 + (int)(Math.random() * 5); // Random year between 2010-2015
        boolean hasSidecar = Math.random() < 0.3; // 30% chance of having sidecar

        return new Motorcycle(owner, licensePlate, year, hasSidecar);
    }


    private static void displayAllVehicles(Vehicle[] vehicles) {
        System.out.println("\n=== ALL VEHICLES ===");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nVehicle #" + (i + 1) + ":");
            vehicles[i].displayInfo();
        }

        // Display statistics
        vehicleStats(vehicles);
    }


    private static void vehicleStats(Vehicle[] vehicles) {
        int carCount = 0;
        int truckCount = 0;
        int motorcycleCount = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                carCount++;
            } else if (vehicle instanceof Truck) {
                truckCount++;
            } else if (vehicle instanceof Motorcycle) {
                motorcycleCount++;
            }
        }

        System.out.println("\n=== VEHICLE STATISTICS ===");
        System.out.println("Total Vehicles: " + vehicles.length);
        System.out.println("Cars: " + carCount + " (" + (carCount * 100 / vehicles.length) + "%)");
        System.out.println("Trucks: " + truckCount + " (" + (truckCount * 100 / vehicles.length) + "%)");
        System.out.println("Motorcycles: " + motorcycleCount + " (" + (motorcycleCount * 100 / vehicles.length) + "%)");
    }


    // Drive method for all vehicle

    private static void demonstratePolymorphism(Vehicle[] vehicles) {
        System.out.println("\n=== DEMONSTRATING POLYMORPHISM ===");
        System.out.println("Calling drive() method on all vehicles:");
        System.out.println("(Each vehicle type responds differently)");

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nVehicle #" + (i + 1) + " drive message:");
            vehicles[i].drive(); // Polymorphic call - different behavior for each type
        }
    }

    // Drive method for some vehicle

    private static void demonstrateOwnershipTransfer(Vehicle[] vehicles) {
        System.out.println("\n=== DEMONSTRATING OWNERSHIP TRANSFER ===");

        // Transfer ownership for first 3 vehicles (or less if array is smaller)
        int transfers = Math.min(3, vehicles.length);

        for (int i = 0; i < transfers; i++) {
            System.out.println("\nTransferring ownership for Vehicle #" + (i + 1) + ":");
            String newOwner = "New Owner " + (i + 1);
            vehicles[i].transferOwnership(newOwner);

            // Show updated information
            System.out.println("Updated vehicle info:");
            vehicles[i].displayInfo();
        }
    }
}