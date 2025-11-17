## **Project Overview**



A Java application demonstrating package organization, namespace management, and access control through multiple package structures. This system shows how to organize related classes, handle naming conflicts, and control visibility across different package hierarchies.



##### **Features**



&nbsp;   Multiple Package Structures: Computer, Traffic, and TEI packages with sub-packages



&nbsp;   Name Conflict Resolution: Same class names in different packages



&nbsp;   Access Modifier Testing: Public, private, protected, and package-private visibility



&nbsp;   Package Hierarchy: Nested package organization (tei.STEF, tei.SEYP, tei.SDO)



&nbsp;   Import Statement Usage: Different ways to import and use packaged classes



&nbsp;   Compilation Control: Command-line compilation of packaged classes



##### **Packages - Classes**



1. Computer Package

&nbsp;	Network Class (Computer Package)



&nbsp;	Represents computer network infrastructure.



&nbsp;	Attributes:



&nbsp;   		description (String): Network description



&nbsp;	Main Methods:



&nbsp;   	Network(): Default constructor - "This is a Data Network"



&nbsp;   	toString(): "This network carries bits and bytes"



2\. Traffic Package

&nbsp;	Network Class (Traffic Package)



&nbsp;	Represents transportation network systems.



&nbsp;	Attributes:



&nbsp;   		description (String): Network description



&nbsp;	Main Methods:



&nbsp;   		Network(): Default constructor - "This is a Traffic Network"



&nbsp;   		toString(): "This network is used by vehicles"



3\. TEI Package 

&nbsp;	STEF Package

&nbsp;		Informatics Class (STEF package)



&nbsp;		Represents informatics department.



&nbsp;		Main Methods:



&nbsp;   			toString(): "Τμήμα Πληροφορικής"



&nbsp;	SEYP Package

&nbsp;		Nursing Class (SEYP package)



&nbsp;		Represents nursing department.



&nbsp;		Main Methods:



&nbsp;   			toString(): "Τμήμα Νοσηλευτικής"



&nbsp;	SDO Package

&nbsp;		Marketing Class (SDO package)



&nbsp;		Represents marketing department.



&nbsp;		Main Methods:



&nbsp;   			toString(): "Τμήμα Εμπορίας και Διαφήμισης"



4\. TestNetwork Class



Demonstrates package usage with same class names.



Main Methods:



&nbsp;   main(): Creates and tests Computer.Network and Traffic.Network



5\. TEITest Class



Tests basic TEI package structure.



Main Methods:



&nbsp;   main(): Tests tei package classes



