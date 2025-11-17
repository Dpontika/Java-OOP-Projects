// Delivery class implementing Insured interface

public class Delivery implements Insured {
    private String description;
    private int price;
    private int weight;
    private boolean fragile;
    private double amount;
    private double[] dimensions; // [length, width, height]

    // Constructor
    public Delivery(String description, int price, int weight,
                    boolean fragile, double amount,
                    double length, double width, double height) {
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.fragile = fragile;
        this.amount = amount;
        this.dimensions = new double[]{length, width, height};
    }

    // Implement Insured interface (which includes ForSale and ForTransfer)

    // From FromSale
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

    // From ForTransfer
    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isFragile() {
        return fragile;
    }

    // From Insured
    @Override
    public double getAmount() {
        return amount;
    }

    // Getters and Setters
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double[] getDimensions() {
        return dimensions;
    }

    public void setDimensions(double length, double width, double height) {
        this.dimensions = new double[]{length, width, height};
    }

    public void displayInfo() {
        System.out.println("Sale - Delivery: " + description);
        System.out.println("Price: " + price + " euros");
        System.out.println("Weight: " + weight + " gr");
        System.out.println("Fragile: " + (fragile ? "Yes" : "No"));
        System.out.println("Insurance amount: " + amount + " euros");
        System.out.println("Dimensions: " + dimensions[0] + "x" + dimensions[1] + "x" + dimensions[2] + " cm");
        System.out.println("Lowest price (70%): " + getLowestPrice(0.7) + " euros");
    }
}