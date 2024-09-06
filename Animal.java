package Wildlife_Habitat_Simulation_Anuj_Squad_47;

public class Animal {
    private String name;
    private String type;

    
    public Animal(String name, String type) {
        this.name = name;  
        this.type = type;  
    }


    public Animal changeType(String newType) {
        this.type = newType; 
        return this;          
    }

    public void displayAnimalInfo() {
        System.out.println("Animal Name: " + this.name); 
        System.out.println("Animal Type: " + this.type);
    }
}


