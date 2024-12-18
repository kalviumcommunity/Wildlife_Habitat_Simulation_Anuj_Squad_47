package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class AnimalDisplayService {
    public void displayAnimalInfo(Animal animal) {
        System.out.println("Animal: " + animal.getName() + ", Type: " + animal.getType() +
                ", Age: " + animal.getAge() + ", Lifespan: " + animal.getLifespan());
    }
}
