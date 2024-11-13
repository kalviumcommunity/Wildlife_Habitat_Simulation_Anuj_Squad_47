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

    public void displayHabitatInfo() {
        System.out.println("Habitat: " + name + ", Area Size: " + areaSize + " sq meters");
    }

    public Habitat changeAreaSize(int newAreaSize) {
        totalHabitatArea -= this.areaSize; // Subtract the old area
        this.areaSize = newAreaSize;
        totalHabitatArea += newAreaSize; // Add the new area
        return this;
    }

    // Static method to return the total habitat area
    public static int getTotalHabitatArea() {
        return totalHabitatArea;
    }
}
