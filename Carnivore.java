package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Carnivore extends Animal {
    public Carnivore(String name) {
        super(name, "Carnivore");
    }

    public void hunt() {
        System.out.println(getType() + " is hunting.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Diet: Meat");
    }
}
