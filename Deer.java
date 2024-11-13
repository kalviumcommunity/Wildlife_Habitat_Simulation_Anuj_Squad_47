package Wildlife_Habitat_Simulation_Anuj_Squad_47;

// Deer class extending Herbivore (Multilevel Inheritance)
class Deer extends Herbivore {
    public Deer(int age, int lifespan) {
        super("Deer", age, lifespan);
    }

    public void sprint() {
        System.out.println("Deer is sprinting quickly to escape predators.");
    }
}
