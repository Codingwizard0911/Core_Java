package object.ArrayObj;

public class Main {
    public static void main(String[] args) {
        Car[] cars = { // Change "Cars" to "Car"
                new Car("Ford", "Mustang", "Red"),
                new Car("Honda", "Civic", "Blue"),
                new Car("Toyota", "Camry", "Silver"),
                new Car("Chevrolet", "Malibu", "Black")
        }; // Create an array of Car objects using the Car class

        // Iterate through the Car objects in the cars array
        for(Car car : cars) {
            car.drive(); // Calling the drive method on each car
        }
    }
}
