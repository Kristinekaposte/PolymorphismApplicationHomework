class Building extends CarbonFootprint {
    private int numberOfFloors;
    private double totalArea; // in square meters (m2)
    private double energyConsumption; // in kWh

    public Building(int numberOfFloors, double totalArea, double energyConsumption) {
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
        this.energyConsumption = energyConsumption;
    }

    @Override
    public double getCarbonFootprint() {
        return energyConsumption * 0.92;
    }

    @Override
    public String toString() {
        return "Building{Floors: " + numberOfFloors + ", Area: " + totalArea + " m2, Energy: " + energyConsumption + " kWh}";
    }
}
