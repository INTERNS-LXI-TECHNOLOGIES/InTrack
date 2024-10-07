import java.util.*;

public class Bike {
    private String name;
    private double price;

    public Bike(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bike{name='" + name + "', price=" + price + "}";
    }

    public static List<Bike> generateBikeList() {
        List<Bike> bikes = new ArrayList<>(Arrays.asList(
            new Bike("Yamaha R1", 20000),
            new Bike("Honda CBR600", 15000),
            new Bike("Ducati Panigale", 28000),
            new Bike("Suzuki GSX-R1000", 18000),
            new Bike("Kawasaki Ninja ZX-10R", 19000),
            new Bike("BMW S1000RR", 25000),
            new Bike("Harley Davidson Roadster", 22000),
            new Bike("Triumph Street Triple", 13000)
        ));

        for (int i = 10; i <= 100; i++) {
            bikes.add(new Bike("Bike Model " + i, Math.random() * 30000)); 
		}

        return bikes;
    }
}
