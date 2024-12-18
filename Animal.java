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

    // Overloaded constructor with default age and lifespan
    public Animal(String name, String type) {
        this(name, type, 0, 0); // Default age and lifespan values
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public int getLifespan() {
        return lifespan;
    }

    // Setter methods (if needed for future use)
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    // Static method to return the total number of animals created
    public static int getTotalAnimals() {
        return totalAnimals;
    }

    // Demonstrating method chaining
    public Animal changeType(String newType) {
        this.type = newType;
        return this;
    }

    // Demonstrating method overriding
    public void sound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}
