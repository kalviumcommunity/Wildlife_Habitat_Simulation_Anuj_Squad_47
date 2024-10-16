package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Habitat {
    private String name;
    private int areaSize;

    // Static variable to keep track of total habitat area across all objects
    private static int totalHabitatArea = 0;

    // Constructor
    public Habitat(String name, int areaSize) {
        this.name = name;
        this.areaSize = areaSize;
        totalHabitatArea += areaSize; // Add area to static variable
    }

    // Accessor methods (getters)
    public String getName() {
        return name;
    }

    public int getAreaSize() {
        return areaSize;
    }

    // Mutator methods (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAreaSize(int areaSize) {
        totalHabitatArea -= this.areaSize; // Subtract old area size
        this.areaSize = areaSize;
        totalHabitatArea += areaSize; // Add new area size
    }

    public void displayHabitatInfo() {
        System.out.println("Habitat: " + name + ", Area Size: " + areaSize + " sq meters");
    }

    // Static method to return the total habitat area
    public static int getTotalHabitatArea() {
        return totalHabitatArea;
    }
}
