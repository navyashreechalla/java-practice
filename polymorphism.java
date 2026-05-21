public class polymorphism {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.speak();
    }
}
class Animal{
    void speak(){
        System.out.println("Hello this is animal speaking");
    }
}
class Cat extends Animal{
   // void speak(){
    //    System.out.println("Meow");
    //}
}