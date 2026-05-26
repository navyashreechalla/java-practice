package Polymorphism;

public class Main {
    public static void main(String[] args) {
        calculator calc = new calculator();

        int result1 = calc.add(10, 20); 
        System.out.println("Result 1 (int, int): " + result1);

        int result2 = calc.add(10, 20, 30); 
        System.out.println("Result 2 (int, int, int): " + result2);

        double result3 = calc.add(10.5, 20.5); 
        System.out.println("Result 3 (double, double): " + result3);
    }
}

