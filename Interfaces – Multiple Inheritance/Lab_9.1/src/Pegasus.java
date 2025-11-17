// Pegasus class - inherits from Horse and implements iBird interface

public class Pegasus extends Horse implements iBird {

    // Constructor
    public Pegasus(int age, double weight) {
        super(age, weight);
    }

    // Implement iBird interface
    @Override
    public void fly() {
        System.out.println("fly high");
    }

    @Override
    public void displayInfo() {
        System.out.println("Pegasus - Age: " + age + " years, Weight: " + weight + " kg");
    }

    public void showAbilities() {
        System.out.print("Pegasus abilities: ");
        fly();
        System.out.print("                  ");
        gallop();
        System.out.print("                  ");
        whinny();
    }
}