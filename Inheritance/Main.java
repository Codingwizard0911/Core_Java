package Inheritance;

public class Main {
    public static void main(String[] args) {
        //inheritance ==> ability of a class to inherit properties and methods from another class
        //inheritance ==> child class inherits properties and methods from parent class
        //inheritance ==> parent class is called base class or super class
        //inheritance ==> child class is called derived class or sub class
        //Types of inheritance:
        //1. single inheritance      ==> child class inherits properties and methods from parent class
        //2. multiple inheritance     ==> child class inherits properties and methods from multiple parent classes    
        //3. multilevel inheritance ==> child class inherits properties and methods from grandparent class
        //4. hierarchical inheritance ==> child class inherits properties and methods from parent class
        //5. hybrid inheritance     ==> combination of multiple inheritance and multilevel inheritance

        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();
        cat.speak();
        dog.speak();
        System.out.println("Dog lives: " + dog.lives);
        System.out.println("Cat lives: " + cat.lives);
        System.out.println("Dog lives: " + dog.isAlive + " Cat lives: " + cat.isAlive);
        Plant plant = new Plant();
        plant.photosynthesis();
        
    }
    
}
