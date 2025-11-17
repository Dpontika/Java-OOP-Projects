## **Project Overview**



A Java application demonstrating interface inheritance and multiple interface implementation.

Models museum artifacts with different capabilities (sale, transport, insurance).



### **Interfaces**



    ForSale: For items that can be sold



        getDescription(): Item description



        getPrice(): Catalog price (in euros)



        getLowestPrice(double percentage): Lowest acceptable price



    FroTransfer: For items that can be transported



        getWEight(): Weight in grams



        isFragile(): Fragility indicator



### **Inherited Interface**



    Insured: Extends both ForSale and FroTransfer



        Inherits all methods from both parent interfaces



        getAmount(): Insurance amount

