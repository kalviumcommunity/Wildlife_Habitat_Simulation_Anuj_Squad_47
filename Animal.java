package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Animal {
    private String name;
    private String type;
    private int age;
    private int lifespan;

    // Static variable to count the total number of animals
    private static int totalAnimals = 0;

    // Existing constructor
    public Animal(String name, String type, int age, int lifespan) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.lifespan = lifespan;
        totalAnimals++;
    }

    // New overloaded constructor
    public Animal(String name, String type) {
        this(name, type, 0, 0); // Default age and lifespan values
    }

    public void displayAnimalInfo() {
        System.out.println("Animal: " + name + ", Type: " + type + ", Age: " + age + ", Lifespan: " + lifespan);
    }

    public Animal changeType(String newType) {
        this.type = newType;
        return this;
    }

    public String getType() {
        return type;
    }

    // Static method to return the total number of animals created
    public static int getTotalAnimals() {
        return totalAnimals;
    }

    // Method for demonstrating method overriding
    public void sound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}
