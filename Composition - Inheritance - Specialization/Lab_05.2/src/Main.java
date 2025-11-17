import java.util.Scanner;

// Main class demonstrating Composition with Vehicle system

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== VEHICLE DRIVING SYSTEM ===");

        // Create 3 vehicles using composition
        Vehicle[] vehicles = createVehicles();

        // Display all vehicles
        displayAllVehicles(vehicles);

        // Answer the required questions
        answerVehicleQuestions(vehicles);

        // Demonstrate operations
        demonstrateVehicleOperations(vehicles);

        scanner.close();
    }


    //Creates and returns an array of 3 vehicles

    private static Vehicle[] createVehicles() {
        Vehicle[] vehicles = new Vehicle[3];

        // Vehicle 1
        DrivingSystem driving1 = new DrivingSystem();
        Engine engine1 = new Engine(1600, 120);
        vehicles[0] = new Vehicle(2018, driving1, engine1);
        vehicles[0].setOwner("LeBron James");
        vehicles[0].setLicence_num("ABC-2323");

        // Vehicle 2
        DrivingSystem driving2 = new DrivingSystem();
        Engine engine2 = new Engine(2000, 150);
        vehicles[1] = new Vehicle(2020, driving2, engine2);
        vehicles[1].setOwner("Leo Messi");
        vehicles[1].setLicence_num("DEF-1010");

        // Vehicle 3
        DrivingSystem driving3 = new DrivingSystem();
        Engine engine3 = new Engine(1400, 90);
        vehicles[2] = new Vehicle(2015, driving3, engine3);
        vehicles[2].setOwner("Maya Moore");
        vehicles[2].setLicence_num("GHI-9874");

        System.out.println("3 vehicles created successfully!");
        return vehicles;
    }


    //Displays all vehicles in the array

    private static void displayAllVehicles(Vehicle[] vehicles) {
        System.out.println("\n=== ALL VEHICLES ===");
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nVehicle " + (i + 1) + ":");
            vehicles[i].displayInfo();
        }
    }


    private static void answerVehicleQuestions(Vehicle[] vehicles) {
        System.out.println("\n=== VEHICLE INFORMATION QUERIES ===");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Get engine capacity of a vehicle");
            System.out.println("2. Get horsepower of a vehicle");
            System.out.println("3. Get owner and manufacturing year of a vehicle");
            System.out.println("4. Exit queries");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            if (choice == 4) {
                break;
            }

            System.out.print("Enter vehicle position (1-3): ");
            int position = scanner.nextInt() - 1;

            if (position < 0 || position >= vehicles.length) {
                System.out.println("Invalid position! Please enter 1-3.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Engine capacity: " +
                            vehicles[position].getEng().getCc() + "cc");
                    break;
                case 2:
                    System.out.println("Horsepower: " +
                            vehicles[position].getEng().getHp() + "hp");
                    break;
                case 3:
                    System.out.println("Owner: " + vehicles[position].getOwner());
                    System.out.println("Manufacturing Year: " + vehicles[position].getYear());
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }


    // Demonstrates vehicle operations

    private static void demonstrateVehicleOperations(Vehicle[] vehicles) {
        System.out.println("\n=== DEMONSTRATING VEHICLE OPERATIONS ===");
        System.out.print("Enter vehicle number to demonstrate operations (1-3): ");
        int vehicleNum = scanner.nextInt() - 1;

        if (vehicleNum >= 0 && vehicleNum < vehicles.length) {
            vehicles[vehicleNum].demonstrateEngine();
            vehicles[vehicleNum].demonstrateDriving();
        } else {
            System.out.println("Invalid vehicle number!");
        }
    }
}
