package Polymorphism;

public class Main2 {
    public static void main(String[] args) {
        shape[] shapes = { new circle(), new square() };

        for (shape s : shapes) {
            s.draw();
        }
    }
}