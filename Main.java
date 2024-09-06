package Wildlife_Habitat_Simulation_Anuj_Squad_47;
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Animal
        Animal lion = new Animal("Lion", "Carnivore");
        lion.displayAnimalInfo();

        // Using the 'this' pointer to chain method calls
        lion.changeType("Herbivore").displayAnimalInfo();

        // Creating an instance of Habitat
        Habitat savanna = new Habitat("Savanna", 500);
        savanna.displayHabitatInfo();

        // Using 'this' for chaining in Habitat
        savanna.changeAreaSize(1000).displayHabitatInfo();
    }
}
