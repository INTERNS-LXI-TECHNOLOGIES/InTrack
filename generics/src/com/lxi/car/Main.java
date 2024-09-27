package com.lxi.car;

public class Main {
    public static void main(String[] args) {
        // Car object with Integer primary key
        Car<Integer> car1 = new Car<>(101, "Model S", "Tesla");

        // Car object with String primary key
        Car<String> car2 = new Car<>("ABC123", "Civic", "Honda");

        // Print car details
        System.out.println(car1);
        System.out.println("------------------");
        System.out.println(car2);
    }
}
