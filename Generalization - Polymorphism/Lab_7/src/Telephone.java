// Abstract base class for Telephone

public abstract class Telephone {
    protected String phoneNumber;
    protected int totalSecondsToFixed;    // Total seconds called to fixed phones
    protected int totalSecondsToMobile;   // Total seconds called to mobile phones

    // Cost matrix: [from][to] where 0=fixed, 1=mobile
    protected static final double[][] costs = {
            {0.05, 0.07},  // from fixed to [fixed, mobile]
            {0.08, 0.10}   // from mobile to [fixed, mobile]
    };

    // Constructor
    public Telephone(String phoneNumber) {
        // Check phone number format (10 digits starting with 2 or 6)
        if (!isValidPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phone number format: " + phoneNumber);
        }
        this.phoneNumber = phoneNumber;
        this.totalSecondsToFixed = 0;
        this.totalSecondsToMobile = 0;
    }

    // Check phone number format: 10 digits, starting with 2 (fixed) or 6 (mobile)
    private boolean isValidPhoneNumber(String number) {
        return number != null &&
                number.matches("[26]\\d{9}") &&
                number.length() == 10;
    }

    public abstract void dial(String targetNumber);
    public abstract double cost();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTotalSecondsToFixed() {
        return totalSecondsToFixed;
    }

    public int getTotalSecondsToMobile() {
        return totalSecondsToMobile;
    }

    // Determine if a number is fixed or mobile
    protected boolean isFixedPhone(String number) {
        return number.startsWith("2");
    }

    // Get cost based on call type
    protected double getCallCost(String targetNumber, int duration) {
        int fromType = isFixedPhone(this.phoneNumber) ? 0 : 1;
        int toType = isFixedPhone(targetNumber) ? 0 : 1;
        return costs[fromType][toType] * duration;
    }

    // Common display method
    public void displayInfo() {
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Type: " + (isFixedPhone(phoneNumber) ? "Fixed" : "Mobile"));
        System.out.println("Seconds to Fixed: " + totalSecondsToFixed);
        System.out.println("Seconds to Mobile: " + totalSecondsToMobile);
        System.out.println("Total Cost: " + String.format("%.2f", cost()) + "€");
    }
}