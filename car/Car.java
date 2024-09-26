public class Car<T> {
    private T primaryKey;
    private String model;
    private String manufacturer;

    public Car(T primaryKey, String model, String manufacturer) {
        this.primaryKey = primaryKey;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public Car() {
        this.primaryKey = null;
        this.model = "Unknown Model";
        this.manufacturer = "Unknown Manufacturer";
    }

    public T getPrimaryKey() {
        return primaryKey;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Car Primary Key: " + primaryKey + 
               "\nModel: " + model + 
               "\nManufacturer: " + manufacturer;
    }
}
