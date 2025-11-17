package Traffic;

//Network class for traffic networks

public class Network {
    private String description;

    // Default constructor
    public Network() {
        this.description = "This is a Traffic Network";
        System.out.println(description);
    }

    // Constructor with parameters
    public Network(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "This network is used by vehicles";
    }
}