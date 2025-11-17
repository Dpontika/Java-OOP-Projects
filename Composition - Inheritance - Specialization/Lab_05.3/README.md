## **Project Overview**



A Java application that models different employee types in a company hierarchy with specialized salary calculations for each role, showcasing how object-oriented principles

enable code reuse and extensibility in business applications.



### **Features**



    Hierarchical Employee Structure: Multi-level inheritance from base Employee to specialized roles



    Polymorphic Salary Calculations: Same method call produces different results based on employee type



    Multiple Employee Types: Support for hourly, salaried, and managerial staff with unique compensation rules



    Comprehensive Reporting: Individual employee details, payroll summaries, and organizational statistics



    Extensible Design: Easy to add new employee types without modifying existing code



### **Classes**



1. Employee Class (Abstract Base Class)



The foundation class defining common properties and behaviors for all employee types.



Attributes:



    name (String): Employee's full name



    id (String): Unique identification number



    specialty (String): Job role or specialization



    address (String): Contact address



Main Methods:



    calculateSalary(): Abstract method - must be implemented by each subclass



    toString(): Returns formatted employee information



    Getters and setters for all properties





2\. HourlyEmployee Class



Employees compensated based on actual hours worked with productivity incentives.



Additional attributes:



    hours (int): Monthly hours worked



Salary Calculation:



    Base rate: 7€ per hour worked



    Productivity bonus: 6% of total hourly earnings



    Formula: (hours × 7) × 6%



Main Methods:



    calculateSalary(): Implements hourly wage calculation with bonus



    toString(): Includes hours worked in employee information





3\. SalariedEmployee Class



Employees with fixed base salary plus family and experience-based allowances.



Additional attributes:



    children (int): Dependents for child allowance



    xp (int): Professional experience for bonus calculation



Salary Calculation:



    Base salary: 700€ monthly



    Child allowance: 5% of base salary per child



    Experience bonus: 10% of base salary per 3 years of experience



    Formula: 700 + (5% × children) + (10% × experience/3)



Main Methods:



    calculateSalary(): Computes total with allowances and experience bonus



    toString(): Displays children count and experience years





4\. Manager Class



Senior employees with management responsibilities, extending salaried employees with additional compensation.



Inherits From: SalariedEmployee (which inherits from Employee)



Additional Compensation:



    Management bonus: 10% of total salaried compensation



    Formula: SalariedEmployeeSalary × 10%



Main Methods:



    calculateSalary(): Applies management bonus to base salaried calculation



    toString(): Identifies role as Manager with bonus indication

