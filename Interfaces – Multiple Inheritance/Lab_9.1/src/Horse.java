
public class Horse {
    protected int age;
    protected double weight;

    // Constructor
    public Horse(int age, double weight) {
        setAge(age);
        setWeight(weight);
    }

    public void whinny() {
        System.out.println("whinny");
    }

    public void gallop() {
        System.out.println("travel fast");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Horse - Age: " + age + " years, Weight: " + weight + " kg");
    }
}