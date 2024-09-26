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
        this.primaryKey = null;  // Default value for primaryKey can be set based on your logic
        this.model = "modelA";
        this.manufacturer = "manufacturerA";	
    }
	

	public T getPrimaryKey() {
        return primaryKey;
    }

	public String getModel() {
        return model;
    }
	
	public String getManufacturer() {
        return manufacturer;
    }
	
	
	@Override
    public String toString() {
        
		return "Cars Details:\n" +
               "Primary Key:" + primaryKey + "\n" + "Model:" + model + "\n" + "Manufacturer:" + manufacturer + "\n";
    }	
}





