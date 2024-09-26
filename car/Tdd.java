public class Tdd {
    public static void main(String[] args) {
        Car<String> carString =new Car<>();
        carString.setId("1");
        carString.setModel("2019");
        carString.setManufacturer("Toyota");
        System.out.println(carString.getPrimaryKey());
        System.out.println(carString);

        Car<Integer> carInteger = new Car<>();
        carInteger.setId(2);
        carInteger.setModel("2002");
        carInteger.setManufacturer("HONDA");
        System.out.println(carInteger.getPrimaryKey());
        System.out.println(carInteger);
    }
}
