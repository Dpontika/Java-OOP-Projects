import tei.STEF.Informatics;
import tei.SEYP.Nursing;
import tei.SDO.Marketing;

/**
 * Test class for nested packages
 */
public class TEITest {
    public static void main(String[] args) {
        System.out.println("=== NESTED PACKAGES DEMONSTRATION ===");

        Informatics informatics = new Informatics();
        Nursing nursing = new Nursing();
        Marketing marketing = new Marketing();

        System.out.println("\nDepartment Information with Schools:");
        System.out.println("Informatics: " + informatics);
        System.out.println("Nursing: " + nursing);
        System.out.println("Marketing: " + marketing);

        // Show full class names with packages
        System.out.println("\nFull Class Names:");
        System.out.println("Informatics: " + informatics.getClass().getName());
        System.out.println("Nursing: " + nursing.getClass().getName());
        System.out.println("Marketing: " + marketing.getClass().getName());
    }
}