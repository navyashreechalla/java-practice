 class Car {
    private int speed = 0;
    public int getSpeed() {
       return speed;
    }
 public void accelerate(int increase) {
    if(increase > 0) {
        speed += increase;
    }
    }
 }
 public class Main2 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.accelerate(30); 
        System.out.println("Current speed: " + myCar.getSpeed() + " MPH");
    }
 }
 


