## **Project Overview**



A Java application that models vehicles as composed objects with separate engine and steering components.



### **Features**



    Component-Based Design: Vehicles are composed of independent engine and steering systems



    Realistic Vehicle Modeling: Accurate representation of automotive systems with specifications like engine displacement and horsepower



    Interactive Testing: Demonstrate individual component functionality (engine operations, steering maneuvers)



    Comprehensive Queries: Retrieve specific vehicle information including engine specs, ownership details, and manufacturing data



    Modular Architecture: Independent components that can be tested, modified, and reused separately



### **Classes**



1. Vehicle Class



The main composite class that brings together engine and steering components to form a complete vehicle.



Attributes:



    owner (String): Vehicle owner's name



    licence\_num (String): Official license plate number



    year (int): Year of vehicle production



    DrivingSystem (driv\_sys): Steering component instance



    eng (Engine): Engine component instance



Main Methods:



    displayInfo(): Shows complete vehicle specifications



    demonstrateDriving(): Tests all driving operations



    demonstrateEngine(): Tests engine startup and shutdown sequences



    Getters and setters for all properties





2\. Engine Class (Engine)



Represents the vehicle's powertrain system with technical specifications.



Attributes:



    cc (int): Engine capacity in cubic centimeters (cc)



    hp (int): Engine power output in horsepower



Main Methods:



    starting(): Engine startup procedure



    running(): Engine running state



    shutDown(): Engine shutdown procedure



    Getters and setters for all properties





3\. DrivingSystem Class



Manages vehicle direction control and movement capabilities.



Main Methods:



    engineOn(): Vehicle engine is on



    turnLeft(): Turn left maneuver



    turnRight(): Turn right maneuver



    engineOff(): Vehicle engine is off

