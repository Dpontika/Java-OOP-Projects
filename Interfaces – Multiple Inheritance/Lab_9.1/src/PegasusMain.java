
public class PegasusMain {

    public static void main(String[] args) {
        System.out.println("Creating Ranch and Aviary with random animals...\n");

        // Create Ranch array (Horse or Pegasus)
        Object[] ranch = new Object[4];
        System.out.println("=== RANCH ===");
        createRanch(ranch);
        displayRanch(ranch);

        // Create Aviary array (Bird or Pegasus)
        Object[] aviary = new Object[4];
        System.out.println("\n=== AVIARY ===");
        createAviary(aviary);
        displayAviary(aviary);
    }

    // Ranch array with 50% Horse, 50% Pegasus

    private static void createRanch(Object[] ranch) {
        for (int i = 0; i < ranch.length; i++) {
            if (Math.random() < 0.5) {
                ranch[i] = new Horse(5 + (int)(Math.random() * 10),
                        300 + (int)(Math.random() * 200));
            } else {
                ranch[i] = new Pegasus(10 + (int)(Math.random() * 15),
                        250 + (int)(Math.random() * 150));
            }
        }
    }

    // Aviary array with 50% Bird, 50% Pegasus

    private static void createAviary(Object[] aviary) {
        for (int i = 0; i < aviary.length; i++) {
            if (Math.random() < 0.5) {
                aviary[i] = new Bird(2 + (int)(Math.random() * 5),
                        1 + (int)(Math.random() * 3));
            } else {
                aviary[i] = new Pegasus(10 + (int)(Math.random() * 15),
                        250 + (int)(Math.random() * 150));
            }
        }
    }

    // Ranch animals and their behaviors

    private static void displayRanch(Object[] ranch) {
        for (int i = 0; i < ranch.length; i++) {
            System.out.println("\nRanch Animal " + (i + 1) + ":");

            if (ranch[i] instanceof Horse) {
                Horse animal = (Horse) ranch[i];
                animal.displayInfo();

                if (ranch[i] instanceof Pegasus) {
                    System.out.println("Type: Pegasus (Mythical Creature)");
                    Pegasus pegasus = (Pegasus) ranch[i];
                    pegasus.showAbilities();
                } else {
                    System.out.println("Type: Horse");
                    animal.whinny();
                    animal.gallop();
                }
            }
        }
    }

    private static void displayAviary(Object[] aviary) {
        for (int i = 0; i < aviary.length; i++) {
            System.out.println("\nAviary Animal " + (i + 1) + ":");

            if (aviary[i] instanceof iBird) {
                iBird animal = (iBird) aviary[i];

                if (aviary[i] instanceof Bird) {
                    Bird bird = (Bird) aviary[i];
                    bird.displayInfo();
                    System.out.println("Type: Bird");
                    bird.fly();
                } else if (aviary[i] instanceof Pegasus) {
                    Pegasus pegasus = (Pegasus) aviary[i];
                    pegasus.displayInfo();
                    System.out.println("Type: Pegasus (Mythical Creature)");
                    pegasus.fly();
                }
            }
        }
    }
}