package Wildlife_Habitat_Simulation_Anuj_Squad_47;

// Herbivore class extending Animal
class Herbivore extends Animal {
    public Herbivore(String name, int age, int lifespan) {
        super(name, "Herbivore", age, lifespan);
    }

    public void graze() {
        System.out.println(getType() + " is grazing on plants.");
    }
}
