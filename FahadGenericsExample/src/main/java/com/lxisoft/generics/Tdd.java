package com.lxisoft.generics;
public class Tdd {
    public static void main(String []args){

        Car<Integer>car1 = new Car<>(1,"city ZX","Honda");

            Car<String>car2 = new Car<>("two","Civic","Honda");

            System.out.println("Car 1(Integer primary key)");
            System.out.println(car1.toString());
            System.out.println();

            System.out.println("Car 2(String primary key)");
            System.out.println(car2.toString());
            System.out.println();
            System.out.println();

           car1.setModel("jeep");
           car1.setManufacturer("Mahindra");
		    System.out.println("Updated Car 1(Integer primary key)");
            System.out.println(car1.toString());
            System.out.println();

            car2.setModel("city");
            car2.setManufacturer("Honda");
             System.out.println("Updated Car 2(Integer primary key)");
             System.out.println(car2.toString());
             System.out.println();
		   


    
    
    }

}
