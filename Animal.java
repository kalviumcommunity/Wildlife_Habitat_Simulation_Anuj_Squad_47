package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Animal {
    private String name;
    private String type;
    private int age;
    private int lifespan;
    
    // Static variable to count the total number of animals
    private static int totalAnimals = 0;

    // Constructor with age and lifespan fields for Milestone 4
    public Animal(String name, String type, int age, int lifespan) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.lifespan = lifespan;
        totalAnimals++; // Increment the static variable each time an animal is created
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
}
