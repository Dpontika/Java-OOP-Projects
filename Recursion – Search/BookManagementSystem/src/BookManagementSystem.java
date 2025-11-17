import java.util.Scanner;

/**
 * Main class for Book Management System
 * This class provides a menu-driven interface to manage books
 */

public class BookManagementSystem {
    private static Book[] books = new Book[10];
    private static int bookCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            displayMainMenu();
            choice = getValidChoice(1, 5);

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    searchBook();
                    break;
                case 3:
                    searchByPriceRange();
                    break;
                case 4:
                    displayAllBooks();
                    break;
                case 5:
                    System.out.println("Program terminated. Goodbye!");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }


    // Displays the main menu

    private static void displayMainMenu() {
        System.out.println("\n=== Book Management System ===");
        System.out.println("1. Add Book");
        System.out.println("2. Search Book");
        System.out.println("3. Search Books by Price Range");
        System.out.println("4. Display All Books");
        System.out.println("5. Exit");
        System.out.print("Enter your choice (1-5): ");
    }

    // Gets a valid choice from the user

    private static int getValidChoice(int min, int max) {
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.print("Invalid choice. Please enter " + min + "-" + max + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }


     // Adds a new book to the array

    private static void addBook() {
        if (bookCount >= books.length) {
            System.out.println("Error: Book array is full! Cannot add more books.");
            return;
        }

        System.out.println("\n=== Add New Book ===");

        // Create new book object
        Book newBook = new Book();

        // Get book details from user
        System.out.print("Enter title: ");
        newBook.setTitle(scanner.nextLine());

        System.out.print("Enter author: ");
        newBook.setAuthor(scanner.nextLine());

        // Validate ISBN
        String isbn;
        while (true) {
            System.out.print("Enter ISBN: ");
            isbn = scanner.nextLine();

            if (MyUtils.isValidISBN(isbn)) {
                newBook.setIsbn(isbn);
                break;
            } else {
                System.out.println("Invalid ISBN format! Please try again.");
                System.out.print("Do you want to try again? (y/n): ");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("y")) {
                    System.out.println("Book addition cancelled.");
                    return;
                }
            }
        }

        System.out.print("Enter publisher: ");
        newBook.setPublisher(scanner.nextLine());

        System.out.print("Enter number of pages: ");
        newBook.setPages(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter publication year: ");
        newBook.setYear(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter price: ");
        newBook.setPrice(Double.parseDouble(scanner.nextLine()));

        // Add book to array
        books[bookCount] = newBook;
        bookCount++;
        System.out.println("Book added successfully!");
    }


    //Searches for a book by ISBN or Year

    private static void searchBook() {
        if (bookCount == 0) {
            System.out.println("No books in the system! Please add books first.");
            return;
        }

        System.out.println("\n=== Search Book ===");
        System.out.println("1. Search by ISBN");
        System.out.println("2. Search by Year");
        System.out.println("3. Return to Main Menu");
        System.out.print("Enter your choice (1-3): ");

        int fieldChoice = getValidChoice(1, 3);

        if (fieldChoice == 3) return;

        System.out.println("\n=== Search Method ===");
        System.out.println("1. Sequential Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Return to Field Selection");
        System.out.print("Enter your choice (1-3): ");

        int methodChoice = getValidChoice(1, 3);

        if (methodChoice == 3) return;

        // Perform search based on selections
        if (fieldChoice == 1) { // Search by ISBN
            System.out.print("Enter ISBN to search: ");
            String searchIsbn = scanner.nextLine();

            if (methodChoice == 1) { // Sequential search
                String[] isbns = new String[bookCount];
                for (int i = 0; i < bookCount; i++) {
                    isbns[i] = books[i].getIsbn();
                }
                int index = MyUtils.seqSearch(isbns, searchIsbn, bookCount);
                displaySearchResult(index, searchIsbn);
            } else { // Binary search
                String[] isbns = new String[bookCount];
                for (int i = 0; i < bookCount; i++) {
                    isbns[i] = books[i].getIsbn();
                }
                int index = MyUtils.binSearch(isbns, searchIsbn, bookCount);
                displaySearchResult(index, searchIsbn);
            }
        } else { // Search by Year
            System.out.print("Enter year to search: ");
            int searchYear = Integer.parseInt(scanner.nextLine());

            if (methodChoice == 1) { // Sequential search
                int[] years = new int[bookCount];
                for (int i = 0; i < bookCount; i++) {
                    years[i] = books[i].getYear();
                }
                int index = MyUtils.seqSearch(years, searchYear, bookCount);
                displaySearchResult(index, searchYear);
            } else { // Binary search
                int[] years = new int[bookCount];
                for (int i = 0; i < bookCount; i++) {
                    years[i] = books[i].getYear();
                }
                int index = MyUtils.binSearch(years, searchYear, bookCount);
                displaySearchResult(index, searchYear);
            }
        }
    }


     // Displays search result

    private static void displaySearchResult(int index, Object searchValue) {
        if (index != -1) {
            System.out.println("\nBook found:");
            books[index].displayBookInfo();
        } else {
            System.out.println("Book with value '" + searchValue + "' not found.");
        }
    }

    // Searches books by price range

    private static void searchByPriceRange() {
        if (bookCount == 0) {
            System.out.println("No books in the system! Please add books first.");
            return;
        }

        System.out.println("\n=== Search by Price Range ===");
        System.out.print("Enter minimum price: ");
        double minPrice = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter maximum price: ");
        double maxPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("\nBooks in price range " + minPrice + " - " + maxPrice + "€:");
        MyUtils.valueSearch(books, bookCount, minPrice, maxPrice);
    }

    //Displays all books in the system

    private static void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the system!");
            return;
        }

        System.out.println("\n=== All Books ===");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Book " + (i + 1) + ":");
            books[i].displayBookInfo();
        }
    }
}