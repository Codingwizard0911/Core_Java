package Composition;

public class Main {
    public static void main(String[] args) {
        /*
         * Composition ==>represents a pot of relationship between objects
         * For example an engine part of a car
         * Allows complex objects to be constructed from smaller objects
         */

        Car car = new Car("Honda", 2025, "V8");
        System.out.println(car.model + " " + car.year + " " + car.engine.type);
        car.start();
    }
    
}
