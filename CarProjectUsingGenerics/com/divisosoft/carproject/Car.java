package com.divisosoft.carproject;

public class Car<T>{
	private T primaryKey;
	private String model;
	private String manufacturer;
	
	public Car(T primaryKey,String model,String manufacturer){
		this.primaryKey=primaryKey;
		this.model=model;
		this.manufacturer=manufacturer;
	}
	
	public Car(){}
	
	public T getPrimaryKey(){
		return primaryKey;
	}
	
	public String getModel(){
		return model;
	}
	public void setModel(){
		this.model=model;
	}
	
	public String getManufacturer(){
		return manufacturer;
	}
	public void setManufacturer(){
		this.manufacturer=manufacturer;
	}
	
	public String toString(){
		return "Primarykey:"+primaryKey+",  model:"+model+",  Manufacturer:"+manufacturer ;
	}
	
	
	public static void main(String args[]){
		Car<String> car1=new Car<>("AB","model 1","Honda");
        Car<Integer> car2=new Car<>(2,"model 2","Tesla");
		
		System.out.println("Car 1:"+car1);
		System.out.println("Car 2:"+car2);
        		
	}
	
	
	
	
	
}