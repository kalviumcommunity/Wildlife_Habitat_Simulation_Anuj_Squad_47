package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name, "Herbivore");
    }

    public void graze() {
        System.out.println(getType() + " is grazing on plants.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Diet: Plants");
    }
}
