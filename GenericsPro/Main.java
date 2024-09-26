public class Main {
    public static void main(String[] args) {
       
        Car<Integer> carWithIntegerKey = new Car<>(101, "Model 1", "BMW");
        System.out.println(carWithIntegerKey.toString());

        
        Car<String> carWithStringKey = new Car<>("ABC123", "Model 2", "Honda");
        System.out.println(carWithStringKey.toString());

        
        Car<String> defaultCar = new Car<>();
        System.out.println(defaultCar.toString());

        
        defaultCar.setModel("Model 3");
        defaultCar.setManufacturer("tesla");
        System.out.println("Updated car: " + defaultCar.toString());
    }
}
