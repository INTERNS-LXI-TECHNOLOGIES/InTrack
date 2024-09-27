public class Car <T> {
    private T primaryKey;         // Can be either Integer or String
    private String model;
    private String manufacturer;

    public Car(T primaryKey,String model,String manufacturer){
        this.primaryKey=primaryKey;
        this.model=model;
        this.manufacturer=manufacturer;
    }

    public Car(){
        this.primaryKey=primaryKey;
        this.model=model;
        this.manufacturer=manufacturer;
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


    public String toString(){
        return  "car detail::"+"\n"+primaryKey+"\n"+model+"\n"+manufacturer+"\n";
    }


}
