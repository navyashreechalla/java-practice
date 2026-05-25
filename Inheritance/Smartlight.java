package Inheritance;

public class Smartlight extends Device {
    String color;
    public Smartlight(String brand, String color) {
        super(brand);
        this.color = color;
    }
    public void changeColor() {
        System.out.println("Changing the light color to " + color + "!");
    }
}

