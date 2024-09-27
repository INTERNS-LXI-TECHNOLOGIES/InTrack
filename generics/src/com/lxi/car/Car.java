
package com.lxi.car;

public class Car<T> {
    // Attributes
    private T primaryKey;
    private String model;
    private String manufacturer;

    // Constructor that takes all parameters
    public Car(T primaryKey, String model, String manufacturer) {
        this.primaryKey = primaryKey;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    // Default constructor
    public Car() {
        this.primaryKey = null;  // Default value (null)
        this.model = "Unknown Model";
        this.manufacturer = "Unknown Manufacturer";
    }

    // Getter for primaryKey
    public T getPrimaryKey() {
        return primaryKey;
    }

    // Getter and setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and setter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Override toString method to display car details
    @Override
    public String toString() {
        return "Car Details:\n" +
               "Primary Key: " + primaryKey + "\n" +
               "Model: " + model + "\n" +
               "Manufacturer: " + manufacturer;
    }

    // Main method to test the Car class
}