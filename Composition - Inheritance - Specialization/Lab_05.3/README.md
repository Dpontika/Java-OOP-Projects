## **Project Overview**



A Java application that models different employee types in a company hierarchy with specialized salary calculations for each role, showcasing how object-oriented principles 

enable code reuse and extensibility in business applications.



##### **Features**



&nbsp;   Hierarchical Employee Structure: Multi-level inheritance from base Employee to specialized roles



&nbsp;   Polymorphic Salary Calculations: Same method call produces different results based on employee type



&nbsp;   Multiple Employee Types: Support for hourly, salaried, and managerial staff with unique compensation rules



&nbsp;   Comprehensive Reporting: Individual employee details, payroll summaries, and organizational statistics



&nbsp;   Extensible Design: Easy to add new employee types without modifying existing code



##### **Classes**



1. Employee Class (Abstract Base Class)



The foundation class defining common properties and behaviors for all employee types.



Attributes:



&nbsp;   name (String): Employee's full name



&nbsp;   id (String): Unique identification number



&nbsp;   specialty (String): Job role or specialization



&nbsp;   address (String): Contact address



Main Methods:



&nbsp;   calculateSalary(): Abstract method - must be implemented by each subclass



&nbsp;   toString(): Returns formatted employee information



&nbsp;   Getters and setters for all properties





2\. HourlyEmployee Class



Employees compensated based on actual hours worked with productivity incentives.



Additional attributes:



&nbsp;   hours (int): Monthly hours worked



Salary Calculation:



&nbsp;   Base rate: 7€ per hour worked



&nbsp;   Productivity bonus: 6% of total hourly earnings



&nbsp;   Formula: (hours × 7) × 6%



Main Methods:



&nbsp;   calculateSalary(): Implements hourly wage calculation with bonus



&nbsp;   toString(): Includes hours worked in employee information





3\. SalariedEmployee Class



Employees with fixed base salary plus family and experience-based allowances.



Additional attributes:



&nbsp;   children (int): Dependents for child allowance



&nbsp;   xp (int): Professional experience for bonus calculation



Salary Calculation:



&nbsp;   Base salary: 700€ monthly



&nbsp;   Child allowance: 5% of base salary per child



&nbsp;   Experience bonus: 10% of base salary per 3 years of experience



&nbsp;   Formula: 700 + (5% × children) + (10% × experience/3)



Main Methods:



&nbsp;   calculateSalary(): Computes total with allowances and experience bonus



&nbsp;   toString(): Displays children count and experience years





4\. Manager Class



Senior employees with management responsibilities, extending salaried employees with additional compensation.



Inherits From: SalariedEmployee (which inherits from Employee)



Additional Compensation:



&nbsp;   Management bonus: 10% of total salaried compensation



&nbsp;   Formula: SalariedEmployeeSalary × 10%



Main Methods:



&nbsp;   calculateSalary(): Applies management bonus to base salaried calculation



&nbsp;   toString(): Identifies role as Manager with bonus indication

