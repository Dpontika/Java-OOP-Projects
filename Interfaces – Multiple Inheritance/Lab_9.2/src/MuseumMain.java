
public class MuseumMain {

    public static void main(String[] args) {
        System.out.println("=== MUSEUM OBJECTS - INTERFACES ===");
        System.out.println();

        System.out.println("=== PHOTOS ===");
        Photo photo1 = new Photo("Palace", 150, true);
        Photo photo2 = new Photo("Sea", 100, false);

        photo1.displayInfo();
        System.out.println();
        photo2.displayInfo();

        System.out.println("\n=== SALES - DELIVERIES ===");
        Delivery del1 = new Delivery("Ancient object", 5000, 1200, true, 200.0, 25.0, 15.0, 30.0);
        Delivery del2 = new Delivery("Statue", 15000, 8500, false, 500.0, 50.0, 25.0, 40.0);

        del1.displayInfo();
        System.out.println();
        del2.displayInfo();

        System.out.println("\n=== TEST INTERFACES ===");
        testInterfaces(photo1, del1);
    }

    // Test the interfaces with different objects

    private static void testInterfaces(ForSale saleObj, Insured insuredObj) {
        System.out.println("\n--- ForSale interface ---");
        System.out.println("Description: " + saleObj.getDescription());
        System.out.println("Price: " + saleObj.getPrice() + " euros");
        System.out.println("Lowest price: " + saleObj.getLowestPrice(0.6) + " euros");

        System.out.println("\n--- Insured interface ---");
        System.out.println("Description: " + insuredObj.getDescription());
        System.out.println("Weight: " + insuredObj.getWeight() + " gr");
        System.out.println("Fragile: " + (insuredObj.isFragile() ? "Yes" : "No"));
        System.out.println("Insurance: " + insuredObj.getAmount() + " euros");

        System.out.println("\n--- Test ForTransfer through Insured ---");
        ForTransfer transferObj = insuredObj; // Upcasting
        System.out.println("Transfer weight: " + transferObj.getWeight() + " gr");
        System.out.println("Fragile: " + (transferObj.isFragile() ? "Yes" : "No"));
    }
}