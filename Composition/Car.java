package Composition;

public class Car {
    String model;
    int year;
    Engine engine;

    Car(String model,int year,String enginetype)
    {
        this.model = model;
        this.year = year;
        this.engine = new Engine(enginetype);
    }

    void start()
    {
        this.engine.start();
        System.out.println("The Car "+this.model +" is started");
    }
    
}
