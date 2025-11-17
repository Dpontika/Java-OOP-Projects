/**
 * Represents a Book with basic attributes
 * This class models a book with title, author, ISBN, publisher, pages, year, and price
 */


public class Book {
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int pages;
    private int year;
    private double price;

    // Default constructor
    public Book() {
    }

    // Constructor with parameters
    public Book(String title, String author, String isbn, String publisher,
                int pages, int year, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Publisher: " + publisher);
        System.out.println("Pages: " + pages);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price + "€");
        System.out.println("---------------------------");
    }
}
