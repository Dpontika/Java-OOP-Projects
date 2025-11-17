### **Project Overview**



A Java application that simulates a vehicle management system with different types of vehicles that share common characteristics but have unique behaviors.



##### **Features**



&nbsp;   Abstract Base Class: Vehicle class that cannot be instantiated directly



&nbsp;   Polymorphic Method Calls: Same method produces different results based on vehicle type



&nbsp;   Multiple Vehicle Types: Cars, Trucks, and Motorcycles with specialized attributes



&nbsp;   Random Generation: Dynamic creation of vehicle arrays with realistic distributions



&nbsp;   Command Line Support: Flexible input via command line arguments or user prompts



&nbsp;   Type-Specific Behaviors: Each vehicle type has unique driving requirements and messages



&nbsp;   Statistical Analysis: Automatic calculation of vehicle type distributions





##### **Classes**



1. Vehicle Class (Abstract Base Class)



The abstract foundation class defining common vehicle properties and behaviors.



Attributes:



&nbsp;   owner (String): Vehicle owner's name



&nbsp;   licensePlate (String): Official license plate number



&nbsp;   manufacturingYear (int): Year of vehicle production



Main Methods:



&nbsp;   transferOwnership(String newOwner): Changes vehicle owner with confirmation message



&nbsp;   drive(): Abstract method - must be implemented by each subclass



&nbsp;   displayInfo(): Shows vehicle specifications



&nbsp;   Getters and setters for all properties





2\. Car Class



Represents passenger cars with door-based classification.



Attributes:



&nbsp;   numberOfDoors (int): Number of doors (typically 3 or 4)



Main Methods:



&nbsp;   drive(): Displays "You need a car driving license dear \[owner]"



&nbsp;   displayInfo(): Shows car-specific information including door count



&nbsp;   getNumberOfDoors()/setNumberOfDoors(): Door count accessors





3\. Truck Class



Represents commercial trucks with axle-based classification.



Attributes:



&nbsp;   numberOfAxles (int): Number of axles (2, 3, or 4)



Main Methods:



&nbsp;   drive(): Displays "You must be a professional driver. This is a \[X] axles truck Mr. \[owner]"



&nbsp;   displayInfo(): Shows truck-specific information including axle count



&nbsp;   getNumberOfAxles()/setNumberOfAxles(): Axle count accessors





4\. Motorcycle Class



Represents motorcycles with sidecar capability.



Attributes:



&nbsp;   hasSidecar (boolean): Indicates if motorcycle has a sidecar



Main Methods:



&nbsp;   drive(): Displays "Your car driving license is not enough. You need a special license dear \[owner]"



&nbsp;   displayInfo(): Shows motorcycle-specific information including sidecar status



&nbsp;   hasSidecar()/setHasSidecar(): Sidecar status accessors





5\. VehicleMain Class (Main Program)



The main driver class that demonstrates polymorphism through vehicle management.



Attributes:



&nbsp;   scanner (Scanner): User input handler



&nbsp;   Static vehicle array and counters



Main Methods:



&nbsp;   main(String\[] args): Program entry point with command line argument handling



&nbsp;   getNumberOfVehicles(String\[] args): Gets vehicle count from args or user input



&nbsp;   createRandomVehicles(int count): Generates vehicles with 80% cars, 10% trucks, 10% motorcycles distribution



&nbsp;   createRandomCar()/createRandomTruck()/createRandomMotorcycle(): Vehicle factory methods with realistic data



&nbsp;   displayAllVehicles(Vehicle\[] vehicles): Shows all vehicles with type-specific information



&nbsp;   demonstratePolymorphism(Vehicle\[] vehicles): Shows polymorphic drive() method behavior



&nbsp;   demonstrateOwnershipTransfer(Vehicle\[] vehicles): Tests ownership transfer functionality



&nbsp;   displayVehicleStatistics(Vehicle\[] vehicles): Calculates and shows type distribution statistics





