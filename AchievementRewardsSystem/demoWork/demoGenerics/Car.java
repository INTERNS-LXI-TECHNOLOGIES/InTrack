public class Car<T>{

    private T primaryKey;
    private String model;
    private String manufacturer;

    public Car(T primaryKey,String model,String manufacturer){
        this.primaryKey=primaryKey;
        this.model=model;
        this.manufacturer=manufacturer;
    }

    public Car(){
        this.primaryKey=null;
        this.model="Hello Model";
        this.manufacturer="Hello Manufacturer";
    }

    public T getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(T primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String toString(){
        return "car details:-" + primaryKey + ", model:-" + model+ ", manufacturer:-" +manufacturer;
    }
    
}