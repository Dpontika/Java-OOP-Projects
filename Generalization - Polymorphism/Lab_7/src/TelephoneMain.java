import java.util.Scanner;

public class TelephoneMain {

    public static void main(String[] args) {
        System.out.println("=== ΤΗΛΕΦΩΝΙΚΟ ΣΥΣΤΗΜΑ ΕΠΙΧΕΙΡΗΣΗΣ ===");

        // Get number of phones from command line or user
        int numberOfPhones = getNumberOfPhones(args);

        // Create array of company phones
        Telephone[] companyPhones = createCompanyPhones(numberOfPhones);

        // Make random calls
        makeRandomCalls(companyPhones);

        // Display results and statistics
        displayResults(companyPhones);
    }


    private static int getNumberOfPhones(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Εισάγετε αριθμό τηλεφώνων της επιχείρησης: ");
        int n = scanner.nextInt();
        scanner.close();

        return n;
    }

    /**
     * Creates an array of company phones with specified distribution:
     * - 70% Fixed phones (starting with 2)
     * - 30% Mobile phones (starting with 6)
     */
    private static Telephone[] createCompanyPhones(int numberOfPhones) {
        Telephone[] phones = new Telephone[numberOfPhones];

        System.out.println("\nΔημιουργία " + numberOfPhones + " τηλεφώνων...");
        System.out.println("Κατανομή: 70% Σταθερά, 30% Κινητά");

        for (int i = 0; i < numberOfPhones; i++) {
            double random = Math.random();

            if (random < 0.7) {
                // Create Fixed phone (70%)
                String fixedNumber = generateFixedNumber(i);
                phones[i] = new Fixed(fixedNumber);
                System.out.println("Δημιουργήθηκε Σταθερό: " + fixedNumber);
            } else {
                // Create Mobile phone (30%)
                String mobileNumber = generateMobileNumber(i);
                phones[i] = new Mobile(mobileNumber);
                System.out.println("Δημιουργήθηκε Κινητό: " + mobileNumber);
            }
        }

        return phones;
    }

    //Create a fixed phone number starting with 2

    private static String generateFixedNumber(int index) {
        // Start with 2, then 9 random digits
        StringBuilder number = new StringBuilder("2");
        for (int i = 0; i < 9; i++) {
            number.append((int)(Math.random() * 10));
        }
        return number.toString();
    }

    //Create a mobile phone number starting with 6

    private static String generateMobileNumber(int index) {
        // Start with 6, then 9 random digits
        StringBuilder number = new StringBuilder("6");
        for (int i = 0; i < 9; i++) {
            number.append((int)(Math.random() * 10));
        }
        return number.toString();
    }

    //Create a random phone number

    private static String generateRandomTargetNumber() {
        double random = Math.random();
        if (random < 0.5) {
            return generateFixedNumber(0).replaceFirst("2", "2"); // Ensure it starts with 2
        } else {
            return generateMobileNumber(0).replaceFirst("6", "6"); // Ensure it starts with 6
        }
    }

    //Make random calls

    private static void makeRandomCalls(Telephone[] phones) {
        // Generate random number of calls (1000-10000)
        int numberOfCalls = 1000 + (int)(Math.random() * 9001);
        System.out.println("\nΠραγματοποίηση " + numberOfCalls + " τυχαίων κλήσεων...");

        for (int i = 0; i < numberOfCalls; i++) {
            // Randomly select a source phone from company phones
            int sourceIndex = (int)(Math.random() * phones.length);
            Telephone sourcePhone = phones[sourceIndex];

            // Generate random target number
            String targetNumber = generateRandomTargetNumber();

            // Make the call
            System.out.println("\nΚλήση " + (i + 1) + ":");
            sourcePhone.dial(targetNumber);

            // Show progress for large numbers of calls
            if ((i + 1) % 1000 == 0) {
                System.out.println("Ολοκληρώθηκαν " + (i + 1) + " κλήσεις...");
            }
        }

        System.out.println("Ολοκληρώθηκαν όλες οι κλήσεις!");
    }

    private static void displayResults(Telephone[] phones) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ΑΠΟΤΕΛΕΣΜΑΤΑ & ΣΤΑΤΙΣΤΙΚΑ");
        System.out.println("=".repeat(50));

        // i. List of all phones with numbers and total costs
        System.out.println("\nΙ. ΚΑΤΑΛΟΓΟΣ ΤΗΛΕΦΩΝΩΝ ΜΕ ΚΟΣΤΟΣ:");
        for (int i = 0; i < phones.length; i++) {
            System.out.println("\nΤηλέφωνο " + (i + 1) + ":");
            phones[i].displayInfo();
        }

        // Calculate statistics
        int totalFixedSeconds = 0;
        int totalMobileSeconds = 0;
        double totalCostToFixed = 0;
        double totalCostToMobile = 0;
        double totalCompanyCost = 0;

        for (Telephone phone : phones) {
            totalFixedSeconds += phone.getTotalSecondsToFixed();
            totalMobileSeconds += phone.getTotalSecondsToMobile();
            totalCompanyCost += phone.cost();

            // Calculate costs by call type
            if (phone instanceof Fixed) {
                // Fixed phone costs
                totalCostToFixed += phone.getTotalSecondsToFixed() * Telephone.costs[0][0];
                totalCostToMobile += phone.getTotalSecondsToMobile() * Telephone.costs[0][1];
            } else {
                // Mobile phone costs
                totalCostToFixed += phone.getTotalSecondsToFixed() * Telephone.costs[1][0];
                totalCostToMobile += phone.getTotalSecondsToMobile() * Telephone.costs[1][1];
            }
        }

        // ii. Total seconds from fixed phones
        System.out.println("\nΙΙ. ΣΥΝΟΛΟ ΔΕΥΤΕΡΟΛΕΠΤΩΝ ΑΠΟ ΣΤΑΘΕΡΑ: " + totalFixedSeconds + " δευτ.");

        // iii. Total seconds from mobile phones
        System.out.println("ΙΙΙ. ΣΥΝΟΛΟ ΔΕΥΤΕΡΟΛΕΠΤΩΝ ΑΠΟ ΚΙΝΗΤΑ: " + totalMobileSeconds + " δευτ.");

        // iv. Total cost to fixed phones
        System.out.println("ΙV. ΣΥΝΟΛΙΚΟ ΚΟΣΤΟΣ ΠΡΟΣ ΣΤΑΘΕΡΑ: " +
                String.format("%.2f", totalCostToFixed) + "€");

        // v. Total cost to mobile phones
        System.out.println("V. ΣΥΝΟΛΙΚΟ ΚΟΣΤΟΣ ΠΡΟΣ ΚΙΝΗΤΑ: " +
                String.format("%.2f", totalCostToMobile) + "€");

        // vi. Total company telephone costs
        System.out.println("VI. ΣΥΝΟΛΙΚΑ ΕΞΟΔΑ ΕΠΙΧΕΙΡΗΣΗΣ: " +
                String.format("%.2f", totalCompanyCost) + "€");

        // Additional statistics
        System.out.println("\nΕΠΙΠΛΕΟΝ ΣΤΑΤΙΣΤΙΚΑ:");
        System.out.println("Συνολικές κλήσεις προς σταθερά: " + totalFixedSeconds + " δευτ.");
        System.out.println("Συνολικές κλήσεις προς κινητά: " + totalMobileSeconds + " δευτ.");
        System.out.println("Συνολικός χρόνος κλήσεων: " + (totalFixedSeconds + totalMobileSeconds) + " δευτ.");
    }
}