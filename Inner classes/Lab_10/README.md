## **Project Overview**



A Java application that showcases how Java supports class nesting for better organization, encapsulation, and design patterns through different inner class variants.



### **Features**



    Four Inner Class Types: Regular, static nested, local, and anonymous inner classes



    Access Modifier Testing: Comprehensive demonstration of public, private, protected, and package-private visibility



    Compilation Error Examples: Intentional demonstration of access restriction violations



    Interface Implementation: Anonymous class usage for quick interface implementations



    Scope and Lifetime Management: Understanding variable access in different inner class contexts



### **Classes**



1. Outer Class (Main Container Class)



The primary container class that hosts all four types of inner classes and demonstrates their usage.



Attributes:



    toString (String): "Outer toString" - demonstrates naming conflicts



    outString (String): "Outer outString" - accessed by inner classes



Main Methods:



    Outer(): Constructor demonstrating local and anonymous inner classes



    main(String\[] args): Test driver for all inner class types



    Local Inner Class Creation: Defines ConInner class within constructor



    Anonymous Class Implementation: Implements Printable interface inline





2\. Printable Interface



Functional interface used for anonymous class demonstration.



Main Methods:



    print(): Abstract method implemented by anonymous class





3\. Inner Class (Regular Inner Class)



Non-static nested class with direct access to outer class instance members.



Attributes:



    inString (String): "Inner inString" - inner class specific data



Main Methods:



    getInString(): Returns inner class field



    getOutString(): Accesses outer class field directly (demonstrates inner class access)





4\. StaticMan Class (Static Nested Class)



Static nested class with restricted access to outer class non-static members.



Main Methods:



    method1(): Public method - accessible everywhere



    method2(): Package-private method - accessible within package



    method3(): Private method - not accessible outside class



    method4(): Protected method - accessible within package and subclasses



    getOutString(): Demonstrates static class limitations (cannot access outer instance fields)





5\. ConInner Class (Local Inner Class)



Class defined within constructor method, demonstrating method-scoped classes.



Main Methods:



    method(): Accesses outer class field directly from constructor scope

