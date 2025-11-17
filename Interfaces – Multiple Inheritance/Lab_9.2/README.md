## **Project Overview**



A Java application demonstrating interface inheritance and multiple interface implementation. 

Models museum artifacts with different capabilities (sale, transport, insurance).



Interfaces



&nbsp;   ForSale: For items that can be sold



&nbsp;       getDescription(): Item description



&nbsp;       getPrice(): Catalog price (in euros)



&nbsp;       getLowestPrice(double percentage): Lowest acceptable price



&nbsp;   FroTransfer: For items that can be transported



&nbsp;       getWEight(): Weight in grams



&nbsp;       isFragile(): Fragility indicator



Inherited Interface



&nbsp;   Insured: Extends both ForSale and FroTransfer



&nbsp;       Inherits all methods from both parent interfaces



&nbsp;       getAmount(): Insurance amount

