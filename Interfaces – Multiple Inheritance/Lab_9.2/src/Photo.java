// Photography class implementing ForSale interface

public class Photo implements ForSale {
    private String description;
    private int price;
    private boolean colored;

    // Constructor
    public Photo(String description, int price, boolean colored) {
        this.description = description;
        this.price = price;
        this.colored = colored;
    }

    // Implement ForSale interface

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getLowestPrice(double percentage) {
        return (int)(price * percentage);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isColored() {
        return colored;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public void displayInfo() {
        System.out.println("Photo: " + description);
        System.out.println("Price: " + price + " euros");
        System.out.println("Colored: " + (colored ? "Yes" : "Noo"));
        System.out.println("Lowest price (80%): " + getLowestPrice(0.8) + " euros");
    }
}