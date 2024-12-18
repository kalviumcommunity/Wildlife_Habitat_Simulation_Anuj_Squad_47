package Wildlife_Habitat_Simulation_Anuj_Squad_47;

// Lion class extending AbstractAnimal


class AbstractLion extends AbstractAnimal {
    public AbstractLion() {
        super("Lion", "Carnivore");
    }

    @Override
    public void makeSound() {
        System.out.println("Abstract Lion roars loudly!");
    }
}
