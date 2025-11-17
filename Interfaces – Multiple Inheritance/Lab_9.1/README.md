## **Project Overview**



A Java application demonstrating how to achieve multiple inheritance in Java using interfaces. 

The project features mythical creatures (Pegasus) that combine behaviors from different animal types.



Interfaces



&nbsp;   iBird: Defines flying behavior



&nbsp;   	fly(): Makes the creature fly



Classes



&nbsp;   Bird: Implements iBird



&nbsp;   	Properties: age, weight



&nbsp;   	Behaviors: fly()



&nbsp;   Horse: Base class for horse-like creatures



&nbsp;       Properties: age, weight



&nbsp;       Behaviors: whinny(), gallop()



&nbsp;   Pegasus: Extends Horse and Implements iBird



&nbsp;       Inherits: whinny(), gallop() from Horse



&nbsp;       Implements: fly() from iBird



