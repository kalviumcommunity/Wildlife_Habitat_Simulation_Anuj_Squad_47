package Wildlife_Habitat_Simulation_Anuj_Squad_47;

public class Main {
    public static void main(String[] args) {
        // Original code remains untouched
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

        System.out.println("Total Animals: " + Animal.getTotalAnimals());

        Habitat savanna = new Habitat("Savanna", 500);
        savanna.displayHabitatInfo();

        savanna.changeAreaSize(1000).displayHabitatInfo();

        System.out.println("Total habitat area: " + Habitat.getTotalHabitatArea() + " sq meters");

        Carnivore lionCarnivore = new Carnivore("Lion", 5, 15);
        lionCarnivore.displayAnimalInfo();
        lionCarnivore.hunt();

        Deer deer = new Deer(3, 20);
        deer.displayAnimalInfo();
        deer.graze();
        deer.sprint();

        // New polymorphism demonstration
        System.out.println("\n--- Polymorphism Demonstration ---");

        // Using overloaded constructors
        Animal tiger = new Animal("Tiger", "Carnivore", 8, 20);
        Animal rabbit = new Animal("Rabbit", "Herbivore"); // Overloaded constructor
        tiger.displayAnimalInfo();
        rabbit.displayAnimalInfo();

        // Using overridden methods
        deer.sound(); // Calls overridden method in Deer
        Animal genericDeer = new Deer(4, 15);
        genericDeer.sound(); // Calls overridden method due to dynamic binding



        
        
        
        
        System.out.println("\n--- Abstract Class and Virtual Function Demonstration ---");

        AbstractAnimal lion1 = new AbstractLion(); // Polymorphic object
        lion1.displayBasicInfo();
        lion1.makeSound(); // Calls overridden method in AbstractLion

        AbstractAnimal deer1 = new AbstractDeer(); // Polymorphic object
        deer1.displayBasicInfo();
        deer1.makeSound(); // Calls overridden method in AbstractDeer

        System.out.println("\nAbstract classes and virtual functions allow flexible and reusable code!");
    }
}
