

package Wildlife_Habitat_Simulation_Anuj_Squad_47;
// Class defining the habitat where animals live
public class Habitat {
    // Attributes
    private String environmentType;
    private int areaSize;

    // Constructor
    public Habitat(String environmentType, int areaSize) {
        this.environmentType = environmentType;
        this.areaSize = areaSize;
    }

    // Member function 1: Display habitat details
    public void displayHabitatInfo() {
        System.out.println("Habitat Type: " + environmentType);
        System.out.println("Habitat Size: " + areaSize + " acres");
    }

    // Member function 2: Simulate change in environment
    public void changeEnvironment(String newEnvironment) {
        this.environmentType = newEnvironment;
        System.out.println("The environment has changed to: " + newEnvironment);
    }
}
