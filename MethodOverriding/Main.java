package MethodOverriding;

public class Main {
    public static void main(String[] args) {
        //Method Overriding ==> When a  Subclass provides its own
        //                      implementation of a  method that is already defined.
        //                      Allows for code reusability and give specific implementations.
        Dog dog = new Dog();
        Fish fish = new Fish();
        dog.move();
        fish.move();
    }
    
}
