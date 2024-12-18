package Wildlife_Habitat_Simulation_Anuj_Squad_47;

// Deer class extending AbstractAnimal


class AbstractDeer extends AbstractAnimal {
    public AbstractDeer() {
        super("Deer", "Herbivore");
    }

    @Override
    public void makeSound() {
        System.out.println("Abstract Deer bleats softly.");
    }
}
