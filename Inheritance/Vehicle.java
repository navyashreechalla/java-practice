package Inheritance;

public class Vehicle {
    String brand;
    String model;
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }
    public void startEngine() {
        System.out.println(brand + " " + model + "engine started!");
    }
}
