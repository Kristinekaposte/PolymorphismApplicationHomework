import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CarbonFootprint> items = new ArrayList<>();
        items.add(new Building(10, 5000, 15000));
        items.add(new Car("Diesel", 15));
        items.add(new Bicycle("Mountain"));

        for (CarbonFootprint item : items) {
            System.out.println(item);
            System.out.println("Carbon Footprint: " + item.getCarbonFootprint() + " kg of CO2");
            System.out.println();
        }
    }
}