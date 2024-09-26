public class Car <T>{

    private T id;
    private String model;
    private String manufacturer;

    public Car(T id,String model,String manufacturer){
        this.id=id;
        this.model=model;
        this.manufacturer=manufacturer;
    }
    public Car(){}

    public T getPrimaryKey(){
        return id;
    }


    public T getId() {
        return id;
    }
    public void setId(T id) {
        this.id = id;
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
        return ""+id+" "+model+" "+manufacturer;
    }
}