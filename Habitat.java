package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Habitat {
    // Private fields, hidden from outside access (Abstraction)
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

    // Public methods to allow controlled access to habitat name and area size (Abstraction)
    public String getName() {
        return name;
    }

    public int getAreaSize() {
        return areaSize;
    }

    // Public methods to allow controlled modification of fields (Abstraction)
    public void setName(String name) {
        this.name = name;
    }

    public void setAreaSize(int areaSize) {
        totalHabitatArea -= this.areaSize; // Subtract old area size
        this.areaSize = areaSize;
        totalHabitatArea += areaSize; // Add new area size
    }

    // Private method to display internal calculations
    private void calculateExpansion() {
        System.out.println("Calculating potential habitat expansion...");
    }

    // Public method to trigger internal logic (Abstraction)
    public void expandHabitat(int extraArea) {
        calculateExpansion(); // Call private method inside a public method (Abstraction)
        setAreaSize(this.areaSize + extraArea);
        System.out.println("Habitat expanded by " + extraArea + " sq meters. New area: " + this.areaSize);
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
