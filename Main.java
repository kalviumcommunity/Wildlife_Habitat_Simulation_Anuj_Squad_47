package Wildlife_Habitat_Simulation_Anuj_Squad_47;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Carnivore("Lion");
        Animal deer = new Herbivore("Deer");

        // Use objects interchangeably
        System.out.println("Displaying Animal Information:");
        lion.displayInfo();
        deer.displayInfo();

        System.out.println("\nTesting Specific Behaviors:");
        if (lion instanceof Carnivore) {
            ((Carnivore) lion).hunt();
        }
        if (deer instanceof Herbivore) {
            ((Herbivore) deer).graze();
        }
    }
}
