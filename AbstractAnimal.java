package Wildlife_Habitat_Simulation_Anuj_Squad_47;

// Abstract class for demonstration of abstract classes and virtual functions


abstract class AbstractAnimal {
    private String name;
    private String type;

    public AbstractAnimal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Abstract method (virtual function)
    public abstract void makeSound();

    public void displayBasicInfo() {
        System.out.println("Abstract Animal: " + name + ", Type: " + type);
    }
}
