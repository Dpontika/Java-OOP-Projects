package Computer;

// Network class for computer networks

public class Network {
    private String description;

    // Default constructor
    public Network() {
        this.description = "This is a Data Network";
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
        return "This network carries bits and bytes";
    }
}