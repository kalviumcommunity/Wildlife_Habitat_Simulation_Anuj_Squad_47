

package Wildlife_Habitat_Simulation_Anuj_Squad_47;
// Class defining the habitat where animals live
public class Habitat {
    private String environmentType;
    private int areaSize;

    // Constructor using 'this' to distinguish between parameters and class attributes
    public Habitat(String environmentType, int areaSize) {
        this.environmentType = environmentType;
        this.areaSize = areaSize;
    }

    // Method using 'this' to return the current object
    public Habitat changeAreaSize(int newAreaSize) {
        this.areaSize = newAreaSize;  // 'this' refers to the current object's areaSize
        return this;                  // Returning 'this' for method chaining
    }

    public void displayHabitatInfo() {
        System.out.println("Habitat Type: " + this.environmentType);
        System.out.println("Habitat Size: " + this.areaSize + " acres");
    }
}
