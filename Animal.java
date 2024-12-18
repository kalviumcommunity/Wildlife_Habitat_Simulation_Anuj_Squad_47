package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Animal {
    private String name;
    private String type;

    // Constructor
    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Method to display general info
    public void displayInfo() {
        System.out.println("Animal Name: " + name + ", Type: " + type);
    }

    // Method to get the animal type
    public String getType() {
        return type;
    }
}
