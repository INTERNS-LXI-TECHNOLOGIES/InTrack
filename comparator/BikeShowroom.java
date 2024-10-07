import java.util.*;

public class BikeShowroom {
    public static void main(String[] args) {

        List<Bike> bikes = Bike.generateBikeList();

        Optional<Bike> mostExpensiveBike = bikes.stream()
        .max(Comparator.comparingDouble(Bike::getPrice));

        mostExpensiveBike.ifPresent(bike -> 
            System.out.println("Most expensive bike: " + bike)
        );
    }
}
