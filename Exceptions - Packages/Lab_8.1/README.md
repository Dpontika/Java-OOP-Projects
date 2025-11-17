## **Project Overview**



A Java application that models employee management with input validation, error handling for various business rules, and error recovery mechanisms.



### **Features**



    Custom Exception Classes: Domain-specific exceptions for invalid data



    Comprehensive Validation: Multiple validation layers for employee data



    Error Recovery: Continue operation after handling exceptions



    Business Rule Enforcement: Automatic validation of age, children count, and work hours



    Multiple Exception Types: Checked, unchecked, and custom exceptions



    Real-world Error Scenarios: Practical examples of common data validation issues



### **Classes**



1. Employee Class



The core employee class with extensive exception handling for data integrity.



Attributes:



    name (String): Employee name



    birthDate (String): 8-digit format (DDMMYYYY)



    workingHours (int\[]): Monthly hours array (12 months)



    overtime (int\[]): Monthly overtime array (12 months)



    dayWage (double): Daily wage rate



    childNo (int): Number of children (non-negative)



    bonusFactor (double): Calculated bonus multiplier



Main Methods:



    Employee(): Constructor with validation for children count and birth date



    setBirthDate(): Validates 8-digit date format with day/month range checks



    setChildNo(): Ensures non-negative children count



    calcSalary(): Salary calculation with division-by-zero handling



    calcBonusFactor(): Bonus calculation with arithmetic exception handling



    calculateTotalOvertime(): Overtime validation with custom exception



    setWorkingHours()/setOvertime(): Array bounds checking





2\. InvalidBirthDateException Class



Custom checked exception for invalid date formats.



Attributes:



    Inherits from Exception class



Main Methods:



    InvalidBirthDateException(String message): Constructor with custom error message





3\. InvalidHoursException Class



Custom checked exception for invalid work hour values.



Attributes:



    Inherits from Exception class



Main Methods:



    InvalidHoursException(String message): Constructor with custom error message





4\. EmployeeTest Class (Main Test Class)



  Testing all exception handling scenarios.



Main Methods:



    main(): Executes all test scenarios sequentially



    Test 1: Valid employee creation and operations



    Test 2: Invalid birth date format handling



    Test 3: Negative children count validation



    Test 4: Division by zero handling (no children)



    Test 5: Array index out of bounds prevention



    Test 6: Excessive overtime validation

