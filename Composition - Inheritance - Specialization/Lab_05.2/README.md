## **Project Overview**



A Java application that models vehicles as composed objects with separate engine and steering components.



##### **Features**



&nbsp;   Component-Based Design: Vehicles are composed of independent engine and steering systems



&nbsp;   Realistic Vehicle Modeling: Accurate representation of automotive systems with specifications like engine displacement and horsepower



&nbsp;   Interactive Testing: Demonstrate individual component functionality (engine operations, steering maneuvers)



&nbsp;   Comprehensive Queries: Retrieve specific vehicle information including engine specs, ownership details, and manufacturing data



&nbsp;   Modular Architecture: Independent components that can be tested, modified, and reused separately



##### **Classes**



1. Vehicle Class



The main composite class that brings together engine and steering components to form a complete vehicle.



Attributes:



&nbsp;   owner (String): Vehicle owner's name



&nbsp;   licence\_num (String): Official license plate number



&nbsp;   year (int): Year of vehicle production



&nbsp;   DrivingSystem (driv\_sys): Steering component instance



&nbsp;   eng (Engine): Engine component instance



Main Methods:



&nbsp;   displayInfo(): Shows complete vehicle specifications



&nbsp;   demonstrateDriving(): Tests all driving operations



&nbsp;   demonstrateEngine(): Tests engine startup and shutdown sequences



&nbsp;   Getters and setters for all properties





2\. Engine Class (Engine)



Represents the vehicle's powertrain system with technical specifications.



Attributes:



&nbsp;   cc (int): Engine capacity in cubic centimeters (cc)



&nbsp;   hp (int): Engine power output in horsepower



Main Methods:



&nbsp;   starting(): Engine startup procedure



&nbsp;   running(): Engine running state



&nbsp;   shutDown(): Engine shutdown procedure



&nbsp;   Getters and setters for all properties





3\. DrivingSystem Class



Manages vehicle direction control and movement capabilities.



Main Methods:



&nbsp;   engineOn(): Vehicle engine is on



&nbsp;   turnLeft(): Turn left maneuver



&nbsp;   turnRight(): Turn right maneuver



&nbsp;   engineOff(): Vehicle engine is off



