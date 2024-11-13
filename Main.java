package Wildlife_Habitat_Simulation_Anuj_Squad_47;

public class Main {
    public static void main(String[] args) {
        // Creating animals with encapsulation methods
        Animal lion = new Animal("Lion", "Carnivore", 5, 15);
        lion.displayAnimalInfo();

        lion.changeType("Herbivore").displayAnimalInfo();

        Animal[] animals = new Animal[5];
        animals[0] = new Animal("Elephant", "Herbivore", 10, 70);
        animals[1] = new Animal("Cheetah", "Carnivore", 6, 12);
        animals[2] = new Animal("Giraffe", "Herbivore", 12, 25);
        animals[3] = new Animal("Lion", "Carnivore", 5, 15);
        animals[4] = new Animal("Zebra", "Herbivore", 8, 20);

        System.out.println("\nArray of Animal Objects:");
        for (Animal animal : animals) {
            animal.displayAnimalInfo();
            System.out.println("---------------------");
        }

        // Display total number of animals created
        System.out.println("Total Animals: " + Animal.getTotalAnimals());

        // Creating habitats
        Habitat savanna = new Habitat("Savanna", 500);
        savanna.displayHabitatInfo();

        savanna.changeAreaSize(1000).displayHabitatInfo();

        // Display total habitat area
        System.out.println("Total habitat area: " + Habitat.getTotalHabitatArea() + " sq meters");

        // Demonstrate single inheritance with Carnivore
        Carnivore lionCarnivore = new Carnivore("Lion", 5, 15);
        lionCarnivore.displayAnimalInfo();
        lionCarnivore.hunt();

        // Demonstrate multilevel inheritance with Deer
        Deer deer = new Deer(3, 20);
        deer.displayAnimalInfo();
        deer.graze();
        deer.sprint();
    }
}
