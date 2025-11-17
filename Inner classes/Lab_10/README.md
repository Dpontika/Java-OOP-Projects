## **Project Overview**



A Java application that showcases how Java supports class nesting for better organization, encapsulation, and design patterns through different inner class variants.



##### **Features**



&nbsp;   Four Inner Class Types: Regular, static nested, local, and anonymous inner classes



&nbsp;   Access Modifier Testing: Comprehensive demonstration of public, private, protected, and package-private visibility



&nbsp;   Compilation Error Examples: Intentional demonstration of access restriction violations



&nbsp;   Interface Implementation: Anonymous class usage for quick interface implementations



&nbsp;   Scope and Lifetime Management: Understanding variable access in different inner class contexts



##### **Classes**



1. Outer Class (Main Container Class)



The primary container class that hosts all four types of inner classes and demonstrates their usage.



Attributes:



&nbsp;   toString (String): "Outer toString" - demonstrates naming conflicts



&nbsp;   outString (String): "Outer outString" - accessed by inner classes



Main Methods:



&nbsp;   Outer(): Constructor demonstrating local and anonymous inner classes



&nbsp;   main(String\[] args): Test driver for all inner class types



&nbsp;   Local Inner Class Creation: Defines ConInner class within constructor



&nbsp;   Anonymous Class Implementation: Implements Printable interface inline





2\. Printable Interface



Functional interface used for anonymous class demonstration.



Main Methods:



&nbsp;   print(): Abstract method implemented by anonymous class





3\. Inner Class (Regular Inner Class)



Non-static nested class with direct access to outer class instance members.



Attributes:



&nbsp;   inString (String): "Inner inString" - inner class specific data



Main Methods:



&nbsp;   getInString(): Returns inner class field



&nbsp;   getOutString(): Accesses outer class field directly (demonstrates inner class access)





4\. StaticMan Class (Static Nested Class)



Static nested class with restricted access to outer class non-static members.



Main Methods:



&nbsp;   method1(): Public method - accessible everywhere



&nbsp;   method2(): Package-private method - accessible within package



&nbsp;   method3(): Private method - not accessible outside class



&nbsp;   method4(): Protected method - accessible within package and subclasses



&nbsp;   getOutString(): Demonstrates static class limitations (cannot access outer instance fields)





5\. ConInner Class (Local Inner Class)



Class defined within constructor method, demonstrating method-scoped classes.



Main Methods:



&nbsp;   method(): Accesses outer class field directly from constructor scope



