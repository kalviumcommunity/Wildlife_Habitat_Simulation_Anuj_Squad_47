package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Habitat {
    // Private fields
    private String name;
    private int areaSize;

    // Static variable to keep track of total habitat area across all objects
    private static int totalHabitatArea = 0;

    // Default Constructor (No arguments)
    public Habitat() {
        this.name = "Unnamed Habitat";  // Default values
        this.areaSize = 0;
        totalHabitatArea += areaSize;
    }

    // Parameterized Constructor (With arguments)
    public Habitat(String name, int areaSize) {
        this.name = name;
        this.areaSize = areaSize;
        totalHabitatArea += areaSize;
    }

    // Public getter methods
    public String getName() {
        return name;
    }

    public int getAreaSize() {
        return areaSize;
    }

    // Public setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAreaSize(int areaSize) {
        totalHabitatArea -= this.areaSize;  // Adjust total area
        this.areaSize = areaSize;
        totalHabitatArea += areaSize;
    }

    // Static method to return the total habitat area
    public static int getTotalHabitatArea() {
        return totalHabitatArea;
    }

    // Public method to display habitat info
    public void displayHabitatInfo() {
        System.out.println("Habitat: " + name + ", Area Size: " + areaSize + " sq meters");
    }
}
