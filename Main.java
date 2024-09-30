package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Animal {
    private String name;
    private String type;
    
    // Static variable to count the total number of animals
    private static int totalAnimals = 0;

    // Constructor
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        totalAnimals++; // Increment the static variable each time an animal is created
    }

    public void displayAnimalInfo() {
        System.out.println("Animal: " + name + ", Type: " + type);
    }

    public Animal changeType(String newType) {
        this.type = newType;
        return this;
    }

}

class Habitat {
    private String name;
    private int areaSize;

    // Static variable to keep track of total habitat area across all objects
    private static int totalHabitatArea = 0;

    // Constructor
    public Habitat(String name, int areaSize) {
        this.name = name;
        this.areaSize = areaSize;
        totalHabitatArea += areaSize; // Add area to static variable
    }

    public void displayHabitatInfo() {
        System.out.println("Habitat: " + name + ", Area Size: " + areaSize + " sq meters");
    }

    public Habitat changeAreaSize(int newAreaSize) {
        totalHabitatArea -= this.areaSize; // Subtract the old area
        this.areaSize = newAreaSize;
        totalHabitatArea += newAreaSize; // Add the new area
        return this;
    }

}

public class Main {
    public static void main(String[] args) {
        // Creating animals
        Animal lion = new Animal("Lion", "Carnivore");
        lion.displayAnimalInfo();

        lion.changeType("Herbivore").displayAnimalInfo();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Elephant", "Herbivore");
        animals[1] = new Animal("Cheetah", "Carnivore");
        animals[2] = new Animal("Giraffe", "Herbivore");

        System.out.println("\nArray of Animal Objects:");
        for (Animal animal : animals) {
            animal.displayAnimalInfo();
            System.out.println("---------------------");
        }

        

        // Creating habitats
        Habitat savanna = new Habitat("Savanna", 500);
        savanna.displayHabitatInfo();

        savanna.changeAreaSize(1000).displayHabitatInfo();

        
    }
}
