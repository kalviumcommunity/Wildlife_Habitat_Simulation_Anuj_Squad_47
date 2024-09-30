package Wildlife_Habitat_Simulation_Anuj_Squad_47;
public class Main {
    public static void main(String[] args) {
        
        Animal lion = new Animal("Lion", "Carnivore");
        lion.displayAnimalInfo();

        
        lion.changeType("Herbivore").displayAnimalInfo();

        
        Habitat savanna = new Habitat("Savanna", 500);
        savanna.displayHabitatInfo();

        
        savanna.changeAreaSize(1000).displayHabitatInfo();

        
        Animal[] animals = new Animal[5];
        animals[0] = new Animal("Elephant", "Herbivore");
        animals[1] = new Animal("Cheetah", "Carnivore");
        animals[2] = new Animal("Giraffe", "Herbivore");
        animals[3] = new Animal("Lion", "Carnivore");
        animals[4] = new Animal("Zebra", "Herbivore");


        
        System.out.println("\nArray of Animal Objects:");
        for (Animal animal : animals) {
            animal.displayAnimalInfo();
            System.out.println("---------------------");
        }
    }
}

