package Wildlife_Habitat_Simulation_Anuj_Squad_47;

// Carnivore class extending Animal (Single Inheritance)
class Carnivore extends Animal {
    public Carnivore(String name, int age, int lifespan) {
        super(name, "Carnivore", age, lifespan);
    }

    public void hunt() {
        System.out.println(getType() + " is hunting...");
    }
}
