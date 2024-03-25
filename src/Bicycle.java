class Bicycle extends CarbonFootprint {
    private String type;

    public Bicycle(String type) {
        this.type = type;
    }

    @Override
    public double getCarbonFootprint() {
        // Bicycles don't emit CO2, so we return 0
        return 0;
    }

    @Override
    public String toString() {
        return "Bicycle{Type: " + type + "}";
    }
}
