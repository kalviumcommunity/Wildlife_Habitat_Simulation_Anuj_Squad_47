package Wildlife_Habitat_Simulation_Anuj_Squad_47;

class AquaticHabitat implements Displayable {
    private String waterType;
    private int depth;

    public AquaticHabitat(String waterType, int depth) {
        this.waterType = waterType;
        this.depth = depth;
    }

    @Override
    public void displayDetails() {
        System.out.println("Aquatic Habitat: Water Type = " + waterType + ", Depth = " + depth + " meters");
    }
}
