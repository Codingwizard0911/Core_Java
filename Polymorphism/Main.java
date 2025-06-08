package Polymorphism;

public class Main {
    public static void main(String[] args) {
        /*
         * Polymorphism ==>  Poly means many
         *                   morph means shape
         *                   objects can identify as other objects
         *                   objects can be treated as objects of a common super class
         */

        Car car = new Car();
        Bike bike = new Bike();

        car.go();
        bike.go();


        Vechile[] vechiles = { car, bike };

        for(Vechile vechile: vechiles)
        {
            vechile.go();
        }
    }
    
}
