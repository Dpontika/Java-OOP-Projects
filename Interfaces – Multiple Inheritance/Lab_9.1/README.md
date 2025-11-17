## **Project Overview**



A Java application demonstrating how to achieve multiple inheritance in Java using interfaces.

The project features mythical creatures (Pegasus) that combine behaviors from different animal types.



### **Interfaces**



    iBird: Defines flying behavior



    	fly(): Makes the creature fly



### **Classes**



    Bird: Implements iBird



    	Properties: age, weight



    	Behaviors: fly()



    Horse: Base class for horse-like creatures



        Properties: age, weight



        Behaviors: whinny(), gallop()



    Pegasus: Extends Horse and Implements iBird



        Inherits: whinny(), gallop() from Horse



        Implements: fly() from iBird

