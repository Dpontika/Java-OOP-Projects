//Bird class implementing iBird interface

public class Bird implements iBird {
    protected int age;
    protected double weight;

    // Constructor
    public Bird(int age, double weight) {
        setAge(age);
        setWeight(weight);
    }

    //Implement iBird interface
    @Override
    public void fly() {
        System.out.println("fly high");
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
        System.out.println("Bird - Age: " + age + " years, Weight: " + weight + " kg");
    }
}