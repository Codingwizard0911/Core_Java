package object.ArrayObj; 

public class Car { // Change class name from Cars to Car
    String make;
    String model;
    String color;

    public Car(String make, String model, String color) { // Constructor should be named 'Car' to match the class name
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }
}
