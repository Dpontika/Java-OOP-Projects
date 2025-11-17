// Class for a fixed landline telephone

public class Fixed extends Telephone {

    // Constructor
    public Fixed(String phoneNumber) {
        super(phoneNumber);
    }

    // Abstract method for fixed phone
    @Override
    public void dial(String targetNumber) {
        // Generate random call duration (0-1000 seconds)
        int duration = (int)(Math.random() * 1001);

        // Determine target type for message
        String targetType = isFixedPhone(targetNumber) ? "σταθερό" : "κινητό";
        String sourceType = "σταθερό";

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

    // Cost calculation for fixed phone
    @Override
    public double cost() {
        double costToFixed = totalSecondsToFixed * costs[0][0];  // fixed to fixed
        double costToMobile = totalSecondsToMobile * costs[0][1]; // fixed to mobile
        return costToFixed + costToMobile;
    }

    // Override display method to include fixed phone info
    @Override
    public void displayInfo() {
        System.out.println("=== ΣΤΑΘΕΡΟ ΤΗΛΕΦΩΝΟ ===");
        super.displayInfo();
        System.out.println("---------------------------");
    }
}