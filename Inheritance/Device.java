package Inheritance;

public class Device {
    String brand;
    public Device(String brand) {
        this.brand = brand;
    }
    public void turnOn(){
        System.out.println(brand + " device is now powered On");
    }
    
}
