public class Main {
    public static void main(String[] args) {
        Car<Integer> car1 = new Car<>(12345, "Model X", "polo");

        Car<String> car2 = new Car<>("ABC1234", "Civic", "Honda");

        System.out.println("Car 1 Details:");
        System.out.println(car1.toString());

        System.out.println("\nCar 2 Details:");
        System.out.println(car2.toString());
    }
}
