package Wildlife_Habitat_Simulation_Anuj_Squad_47;

public class Main {
    public static void main(String[] args) {
        // Creating animals using both the default and parameterized constructors
        Animal unknownAnimal = new Animal(); // Using default constructor
        unknownAnimal.displayAnimalInfo();

        Animal lion = new Animal("Lion", "Carnivore", 5, 15); // Using parameterized constructor
        lion.displayAnimalInfo();

        // Array of animals using parameterized constructor
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

        // Creating habitats using both the default and parameterized constructors
        Habitat defaultHabitat = new Habitat(); // Using default constructor
        defaultHabitat.displayHabitatInfo();

        Habitat savanna = new Habitat("Savanna", 500); // Using parameterized constructor
        savanna.displayHabitatInfo();

        // Display total habitat area
        System.out.println("Total habitat area: " + Habitat.getTotalHabitatArea() + " sq meters");
    }
}
