// Represents a car engine with specifications and operations

public class Engine {
    private int cc;    // engine capacity in cc
    private int hp;  // horsepower

    // Constructor
    public Engine(int cc, int hp) {
        this.cc = cc;
        this.hp = hp;
    }

    public void running() {
        System.out.println("Engine is running...");
    }

    public void starting() {
        System.out.println("Engine is starting...");
    }

    public void shutDown() {
        System.out.println("Engine is shutting down...");
    }

    // Getters and Setters
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
