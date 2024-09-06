

package Wildlife_Habitat_Simulation_Anuj_Squad_47;
public class Main {
    public static void main(String[] args) {
        
        Animal lion = new Animal("Lion", "Carnivore");
        Habitat savanna = new Habitat("Savanna", 500);

        
        
        lion.displayAnimalInfo();
        lion.makeSound();

        
        savanna.displayHabitatInfo();
        savanna.changeEnvironment("Forest");
    }
}
