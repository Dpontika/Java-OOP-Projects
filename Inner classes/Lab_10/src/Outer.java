/**
 * Outer class demonstrating different types of inner classes
 * - Regular inner class
 * - Static nested class
 * - Local inner class in constructor
 * - Anonymous inner class
 */

public class Outer {
    private String toString = "Outer toString";
    private String outString = "Outer outString";

    // Default constructor
    public Outer() {
        System.out.println("Outer constructor called");

        // 6. Local inner class in constructor
        class ConInner {
            public void method() {
                System.out.println(outString);  // Can access outString directly
            }
        }

        // 7. Create object of local inner class and call method
        ConInner ci = new ConInner();
        System.out.print("ConInner method output: ");
        ci.method();

        // 8. Anonymous class implementing Printable interface
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("Mitsos");
            }
        };

        System.out.print("Anonymous class print output: ");
        p.print();
    }

    // Interface definition
    public interface Printable {
        public void print();
    }

    // Regular inner class (non-static)
    public class Inner {
        private String inString = "Inner inString";

        public String getInString() {
            return this.inString;
        }

        public String getOutString() {
            return outString;  // Can access outer class field directly
        }
    }

    // Static nested class
    public static class StaticMan {
        public void method1() {
            System.out.println("method1 called");
        }

        void method2() {
            System.out.println("method2 called");
        }

        private void method3() {
            System.out.println("method3 called");
        }

        protected void method4() {
            System.out.println("method4 called");
        }

        // 4. Fixed getOutString method - cannot access non-static outString
        public String getOutString() {
            String result = "";
            // Static class cannot access non-static members of outer class
            return result;
        }
    }

    // 2. Main method
    public static void main(String[] args) {
        System.out.println("=== INNER CLASSES DEMONSTRATION ===");

        // 3.1 Create Outer object and Inner object
        Outer out = new Outer();  // This will run constructor code
        Outer.Inner inn = out.new Inner();  // Inner class needs outer instance

        // 3.2 Call methods on inner object
        System.out.println("\n--- Inner Class Method Calls ---");
        System.out.println("inn.getInString(): " + inn.getInString());
        System.out.println("inn.getOutString(): " + inn.getOutString());


        // 3.3 Create StaticMan object and call methods
        System.out.println("\n--- Static Nested Class Method Calls ---");
        Outer.StaticMan sm = new Outer.StaticMan();
        sm.method1();  // Public - will work
        sm.method2();  // Package-private - will work in same package
        // sm.method3();  // Private - WON'T COMPILE - not accessible outside class
        sm.method4();  // Protected - will work in same package

        System.out.println("sm.getOutString(): " + sm.getOutString());

        System.out.println("\n=== PROGRAM COMPLETED ===");
    }
}