## **Project Overview**



A Java application demonstrating that implements a complete book management system with ISBN validation, multiple search methods, and menu-driven user interaction.



##### **Features**



    Book Catalog Management: Store up to 10 books with detailed information



    ISBN Validation: Supports both ISBN-10 and ISBN-13 formats with mathematical validation



    Multiple Search Methods: Sequential and binary search for different data types



    Price Range Search: Find books within specific price ranges



    Menu-Driven Interface: User-friendly console-based navigation



    Input Validation: Error handling and data validation





##### **Classes**



1\. Book Class



Represents a book with comprehensive attributes:



    Title (String): Book title



    Author (String): Author's full name



    ISBN (String): International Standard Book Number



    Publisher (String): Publishing company



    Pages (int): Number of pages



    Year (int): Publication year



    Price (double): Book price in euros



Main Methods:



    displayBookInfo(): Shows all book details



    Getters and setters for all attributes





2\. MyUtils Class



Utility class containing search algorithms and validation methods:



Search Methods (Overloaded):



    seqSearch(): Sequential search for integers and strings



    binSearch(): Binary search for integers and strings



    valueSearch(): Search books by price range



Validation Methods:



    isValidISBN(): Validates ISBN-10 and ISBN-13 formats



    isValidISBN10(): ISBN-10 checksum validation



    isValidISBN13(): ISBN-13 checksum validation





3\. BookManagementSystem Class



Main program with menu-driven interface:



Main Menu Options:



    Add Book: Input new book with ISBN validation



    Search Book: Search by ISBN or Year using different algorithms



    Search by Price Range: Find books within price limits



    Display All Books: Show all books in catalog



    Exit: Terminate program

