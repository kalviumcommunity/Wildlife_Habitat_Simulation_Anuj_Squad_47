

package Wildlife_Habitat_Simulation_Anuj_Squad_47;
public class Animal {
    // Attributes (Encapsulated properties)
    private String name;
    private String type;

    // Constructor
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Member function 1: Get animal details
    public void displayAnimalInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Type: " + type);
    }

    // Member function 2: Simulate animal action
    public void makeSound() {
        System.out.println(name + " is making a sound!");
    }
}

