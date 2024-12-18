package Wildlife_Habitat_Simulation_Anuj_Squad_47;

public class Main {
    public static void main(String[] args) {
        // Logger service for logging actions
        LoggerService logger = new LoggerService();

        // Creating animals using different constructors
        logger.log("Creating animal objects.");
        Animal lion = new Animal("Lion", "Carnivore", 5, 15);
        Animal elephant = new Animal("Elephant", "Herbivore");

        // Using display service
        AnimalDisplayService animalDisplayService = new AnimalDisplayService();
        logger.log("Displaying animal information.");
        animalDisplayService.displayAnimalInfo(lion);
        animalDisplayService.displayAnimalInfo(elephant);

        // Method chaining and overriding demonstration
        lion.changeType("Omnivore");
        logger.log("After changing type:");
        animalDisplayService.displayAnimalInfo(lion);
        lion.sound();

        // Total animal count
        logger.log("Total Animals: " + Animal.getTotalAnimals());


        Habitat savanna = new Habitat("Savanna", 500);
        savanna.displayHabitatInfo();

        // New Aquatic Habitat
        AquaticHabitat ocean = new AquaticHabitat("Saltwater", 200);
        ocean.displayDetails();

        // Using the Displayable interface
        Displayable[] habitats = { savanna, ocean };
        System.out.println("\nDisplaying all habitats:");
        for (Displayable habitat : habitats) {
            habitat.displayDetails();
        }
    }
}
