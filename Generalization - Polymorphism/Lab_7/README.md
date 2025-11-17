## **Project Overview**



A Java application that models a company telephone network with different telephone types (fixed and mobile) that share common calling behaviors but 

have unique cost calculations, showcasing real-world telecommunications billing systems.



##### **Features**



&nbsp;   Abstract Base Class: Telephone class with common calling functionality



&nbsp;   Polymorphic Cost Calculations: Same method produces different billing rates based on call types



&nbsp;   Multiple Telephone Types: Fixed and mobile phones with distinct number patterns



&nbsp;   Random Call Generation: Dynamic simulation of thousands of telephone calls



&nbsp;   Cost Matrix System: Comprehensive billing rates for all call type combinations



&nbsp;   Statistical Reporting: Detailed call analytics and cost summaries



&nbsp;   Phone Number Validation: Automatic validation of telephone number formats



##### **Classes**



1. Telephone Class (Abstract Base Class)



The abstract foundation class defining common telephone properties and cost structures.



Attributes:



&nbsp;   phoneNumber (String): 10-digit telephone number



&nbsp;   totalSecondsToFixed (int): Cumulative seconds called to fixed phones



&nbsp;   totalSecondsToMobile (int): Cumulative seconds called to mobile phones



&nbsp;   costs (static double\[]\[]): Billing rates matrix \[from\_type]\[to\_type]



Main Methods:



&nbsp;   dial(String targetNumber): Abstract method - initiates calls with duration tracking



&nbsp;   cost(): Abstract method - calculates total call costs



&nbsp;   isValidPhoneNumber(String number): Validates 10-digit format starting with 2 or 6



&nbsp;   isFixedPhone(String number): Determines if number is fixed (starts with 2) or mobile (starts with 6)



&nbsp;   getCallCost(String targetNumber, int duration): Calculates cost based on call type matrix



&nbsp;   displayInfo(): Shows telephone information and call statistics





2\. Fixed Class (Fixed Telephone)



Represents landline telephones with fixed location and specific billing rates.



Attributes:



&nbsp;   Inherits all attributes from Telephone class



Main Methods:



&nbsp;   dial(String targetNumber): Implements fixed phone calling with Greek messages



&nbsp;   cost(): Calculates costs using fixed phone rates (0.05€ fixed-to-fixed, 0.07€ fixed-to-mobile)



&nbsp;   displayInfo(): Shows fixed telephone specific information





3\. Mobile Class (Mobile Telephone)



Represents mobile telephones with higher billing rates and mobility.



Attributes:



&nbsp;   Inherits all attributes from Telephone class



Main Methods:



&nbsp;   dial(String targetNumber): Implements mobile phone calling with Greek messages



&nbsp;   cost(): Calculates costs using mobile phone rates (0.08€ mobile-to-fixed, 0.10€ mobile-to-mobile)



&nbsp;   displayInfo(): Shows mobile telephone specific information





4 .TelephoneMain Class (Main Program)



The main class that simulates company telephone network operations.



Attributes:



&nbsp;   scanner (Scanner): User input handler



&nbsp;   Static telephone arrays and counters



Main Methods:



&nbsp;   main(String\[] args): Program entry point with command line argument processing



&nbsp;   getNumberOfPhones(String\[] args): Gets phone count from args or user input



&nbsp;   createCompanyPhones(int count): Generates phones with 70% fixed, 30% mobile distribution



&nbsp;   generateFixedNumber()/generateMobileNumber()/generateRandomTargetNumber(): Phone number generation utilities



&nbsp;   makeRandomCalls(Tilefono\[] phones): Simulates 1000-10000 random calls between phones



&nbsp;   displayResults(Tilefono\[] phones): Comprehensive reporting of all call statistics and costs





Cost Matrix



FROM → TO     | Fixed (Σταθερό) | Mobile (Κινητό)

Fixed         | 0.05€/sec       | 0.07€/sec

Mobile        | 0.08€/sec       | 0.10€/sec

