## **Project Overview**



A Java application that models employee management with input validation, error handling for various business rules, and error recovery mechanisms.



##### **Features**



&nbsp;   Custom Exception Classes: Domain-specific exceptions for invalid data



&nbsp;   Comprehensive Validation: Multiple validation layers for employee data



&nbsp;   Error Recovery: Continue operation after handling exceptions



&nbsp;   Business Rule Enforcement: Automatic validation of age, children count, and work hours



&nbsp;   Multiple Exception Types: Checked, unchecked, and custom exceptions



&nbsp;   Real-world Error Scenarios: Practical examples of common data validation issues



##### **Classes**



1. Employee Class 



The core employee class with extensive exception handling for data integrity.



Attributes:



&nbsp;   name (String): Employee name



&nbsp;   birthDate (String): 8-digit format (DDMMYYYY)



&nbsp;   workingHours (int\[]): Monthly hours array (12 months)



&nbsp;   overtime (int\[]): Monthly overtime array (12 months)



&nbsp;   dayWage (double): Daily wage rate



&nbsp;   childNo (int): Number of children (non-negative)



&nbsp;   bonusFactor (double): Calculated bonus multiplier



Main Methods:



&nbsp;   Employee(): Constructor with validation for children count and birth date



&nbsp;   setBirthDate(): Validates 8-digit date format with day/month range checks



&nbsp;   setChildNo(): Ensures non-negative children count



&nbsp;   calcSalary(): Salary calculation with division-by-zero handling



&nbsp;   calcBonusFactor(): Bonus calculation with arithmetic exception handling



&nbsp;   calculateTotalOvertime(): Overtime validation with custom exception



&nbsp;   setWorkingHours()/setOvertime(): Array bounds checking





2\. InvalidBirthDateException Class



Custom checked exception for invalid date formats.



Attributes:



&nbsp;   Inherits from Exception class



Main Methods:



&nbsp;   InvalidBirthDateException(String message): Constructor with custom error message





3\. InvalidHoursException Class



Custom checked exception for invalid work hour values.



Attributes:



&nbsp;   Inherits from Exception class



Main Methods:



&nbsp;   InvalidHoursException(String message): Constructor with custom error message





4\. EmployeeTest Class (Main Test Class)



&nbsp; Testing all exception handling scenarios.



Main Methods:



&nbsp;   main(): Executes all test scenarios sequentially



&nbsp;   Test 1: Valid employee creation and operations



&nbsp;   Test 2: Invalid birth date format handling



&nbsp;   Test 3: Negative children count validation



&nbsp;   Test 4: Division by zero handling (no children)



&nbsp;   Test 5: Array index out of bounds prevention



&nbsp;   Test 6: Excessive overtime validation

