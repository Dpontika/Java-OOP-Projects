
public class TestNetwork {
    public static void main(String[] args) {
        System.out.println("=== NETWORK PACKAGES DEMONSTRATION ===");

        // Create Computer Network
        System.out.println("\n--- Computer Network ---");
        Computer.Network compNetwork = new Computer.Network();
        System.out.println(compNetwork.toString());

        // Create Traffic Network
        System.out.println("\n--- Traffic Network ---");
        Traffic.Network trafficNetwork = new Traffic.Network();
        System.out.println(trafficNetwork.toString());

        // Demonstrate they are different types
        System.out.println("\n--- Type Information ---");
        System.out.println("Computer Network class: " + compNetwork.getClass().getName());
        System.out.println("Traffic Network class: " + trafficNetwork.getClass().getName());
    }
}


