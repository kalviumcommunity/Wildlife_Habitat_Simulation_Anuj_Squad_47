package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class Animal {
    // Private fields
    private String name;
    private String type;
    private int age;
    private int lifespan;

    // Static variable to count the total number of animals
    private static int totalAnimals = 0;

    // Default Constructor (No arguments)
    public Animal() {
        this.name = "Unknown";    // Default values
        this.type = "Unknown";
        this.age = 0;
        this.lifespan = 0;
        totalAnimals++;
    }

    // Parameterized Constructor (With arguments)
    public Animal(String name, String type, int age, int lifespan) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.lifespan = lifespan;
        totalAnimals++; // Increment the static variable each time an animal is created
    }

    // Public getter methods
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

    // Public setter methods
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

    // Public method to display animal info
    public void displayAnimalInfo() {
        System.out.println("Animal: " + name + ", Type: " + type + ", Age: " + age + ", Lifespan: " + lifespan);
    }
}
