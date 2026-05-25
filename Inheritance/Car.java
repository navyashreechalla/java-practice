package Inheritance;

class Car extends Vehicle {
    int doors;
    public Car(String brand, String model, int doors) {
        super(brand, model);
        this.doors = doors;

    }
    public void openSunroof(){
        System.out.println("Sunroof is opening!");

    }
    
}
