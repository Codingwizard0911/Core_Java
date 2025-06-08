package object;

public class Object {
    public static void main(String[] args) {
        //object ==> An entity that holds data (attributes) and 
        //          can perform actions (methods)
        //          It is a reference data type
        //          We store the data for an object in location called heap
        Car car = new Car();
        //. ==> allows to access data 
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.year);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
    }

    
    
}
