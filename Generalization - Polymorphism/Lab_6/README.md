### **Project Overview**



A Java application that simulates a vehicle management system with different types of vehicles that share common characteristics but have unique behaviors.



### **Features**



    Abstract Base Class: Vehicle class that cannot be instantiated directly



    Polymorphic Method Calls: Same method produces different results based on vehicle type



    Multiple Vehicle Types: Cars, Trucks, and Motorcycles with specialized attributes



    Random Generation: Dynamic creation of vehicle arrays with realistic distributions



    Command Line Support: Flexible input via command line arguments or user prompts



    Type-Specific Behaviors: Each vehicle type has unique driving requirements and messages



    Statistical Analysis: Automatic calculation of vehicle type distributions





### **Classes**



1. Vehicle Class (Abstract Base Class)



The abstract foundation class defining common vehicle properties and behaviors.



Attributes:



    owner (String): Vehicle owner's name



    licensePlate (String): Official license plate number



    manufacturingYear (int): Year of vehicle production



Main Methods:



    transferOwnership(String newOwner): Changes vehicle owner with confirmation message



    drive(): Abstract method - must be implemented by each subclass



    displayInfo(): Shows vehicle specifications



    Getters and setters for all properties





2\. Car Class



Represents passenger cars with door-based classification.



Attributes:



    numberOfDoors (int): Number of doors (typically 3 or 4)



Main Methods:



    drive(): Displays "You need a car driving license dear \[owner]"



    displayInfo(): Shows car-specific information including door count



    getNumberOfDoors()/setNumberOfDoors(): Door count accessors





3\. Truck Class



Represents commercial trucks with axle-based classification.



Attributes:



    numberOfAxles (int): Number of axles (2, 3, or 4)



Main Methods:



    drive(): Displays "You must be a professional driver. This is a \[X] axles truck Mr. \[owner]"



    displayInfo(): Shows truck-specific information including axle count



    getNumberOfAxles()/setNumberOfAxles(): Axle count accessors





4\. Motorcycle Class



Represents motorcycles with sidecar capability.



Attributes:



    hasSidecar (boolean): Indicates if motorcycle has a sidecar



Main Methods:



    drive(): Displays "Your car driving license is not enough. You need a special license dear \[owner]"



    displayInfo(): Shows motorcycle-specific information including sidecar status



    hasSidecar()/setHasSidecar(): Sidecar status accessors





5\. VehicleMain Class (Main Program)



The main driver class that demonstrates polymorphism through vehicle management.



Attributes:



    scanner (Scanner): User input handler



    Static vehicle array and counters



Main Methods:



    main(String\[] args): Program entry point with command line argument handling



    getNumberOfVehicles(String\[] args): Gets vehicle count from args or user input



    createRandomVehicles(int count): Generates vehicles with 80% cars, 10% trucks, 10% motorcycles distribution



    createRandomCar()/createRandomTruck()/createRandomMotorcycle(): Vehicle factory methods with realistic data



    displayAllVehicles(Vehicle\[] vehicles): Shows all vehicles with type-specific information



    demonstratePolymorphism(Vehicle\[] vehicles): Shows polymorphic drive() method behavior



    demonstrateOwnershipTransfer(Vehicle\[] vehicles): Tests ownership transfer functionality



    displayVehicleStatistics(Vehicle\[] vehicles): Calculates and shows type distribution statistics

