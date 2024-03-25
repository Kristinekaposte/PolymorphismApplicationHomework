class Car extends CarbonFootprint {
    private String fuelType;
    private double fuelEfficiency; // km per liter

    public Car(String fuelType, double fuelEfficiency) {
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public double getCarbonFootprint() {
        return fuelEfficiency * 2.3;
    }

    @Override
    public String toString() {
        return "Car{Fuel Type: " + fuelType + ", Efficiency: " + fuelEfficiency + " km/l}";
    }
}
