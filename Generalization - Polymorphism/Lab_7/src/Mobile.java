
/**
 * Mobile telephone class - extends Telephone
 * Represents a mobile telephone
 */
public class Mobile extends Telephone {

    // Constructor
    public Mobile(String phoneNumber) {
        super(phoneNumber);
    }

    // Abstract method for mobile phone
    @Override
    public void dial(String targetNumber) {
        // Generate random call duration (0-1000 seconds)
        int duration = (int)(Math.random() * 1001);

        // Determine target type for message
        String targetType = isFixedPhone(targetNumber) ? "σταθερό" : "κινητό";
        String sourceType = "κινητό";

        // Display call message
        System.out.println("Κλήση από το " + sourceType + " τηλέφωνο " + phoneNumber +
                " προς το " + targetType + " με αριθμό " + targetNumber);

        // Update call seconds based on target type
        if (isFixedPhone(targetNumber)) {
            totalSecondsToFixed += duration;
        } else {
            totalSecondsToMobile += duration;
        }

        System.out.println("Διάρκεια: " + duration + " δευτερόλεπτα");
    }

    // Cost calculation for mobile phone
    @Override
    public double cost() {
        double costToFixed = totalSecondsToFixed * costs[1][0];  // mobile to fixed
        double costToMobile = totalSecondsToMobile * costs[1][1]; // mobile to mobile
        return costToFixed + costToMobile;
    }

    // Override display method to include mobile phone info
    @Override
    public void displayInfo() {
        System.out.println("=== ΚΙΝΗΤΟ ΤΗΛΕΦΩΝΟ ===");
        super.displayInfo();
        System.out.println("---------------------------");
    }
}