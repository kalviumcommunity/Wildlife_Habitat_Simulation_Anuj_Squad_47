package Wildlife_Habitat_Simulation_Anuj_Squad_47;

public class Main {
    public static void main(String[] args) {
        // Creating animals with encapsulation and abstraction
        Animal lion = new Animal("Lion", "Carnivore", 5, 15);
        lion.displayAnimalInfo();

        // Accessing and modifying through public methods (Abstraction)
        lion.setType("Herbivore");
        lion.setAge(6);
        lion.growOlder(); // Public method that internally calls a private method
        lion.displayAnimalInfo();

        Animal[] animals = new Animal[5];
        animals[0] = new Animal("Elephant", "Herbivore", 10, 70);
        animals[1] = new Animal("Cheetah", "Carnivore", 3, 12);
        animals[2] = new Animal("Giraffe", "Herbivore", 7, 25);
        animals[3] = new Animal("Lion", "Carnivore", 5, 15);
        animals[4] = new Animal("Zebra", "Herbivore", 4, 25);

        System.out.println("\nArray of Animal Objects:");
        for (Animal animal : animals) {
            animal.displayAnimalInfo();
            System.out.println("---------------------");
        }

        // Display total number of animals created
        System.out.println("Total Animals: " + Animal.getTotalAnimals());

        // Creating habitats with encapsulation and abstraction
        Habitat savanna = new Habitat("Savanna", 500);
        savanna.displayHabitatInfo();

        // Modifying and expanding the habitat through public methods (Abstraction)
        savanna.setAreaSize(1000);
        savanna.expandHabitat(200); // Public method that internally calls a private method
        savanna.setName("Expanded Savanna");
        savanna.displayHabitatInfo();

        // Display total habitat area
        System.out.println("Total habitat area: " + Habitat.getTotalHabitatArea() + " sq meters");
    }
}
