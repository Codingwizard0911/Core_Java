package object;
public class Car {

        String make = "Ford";
        String model = "Mustang";
        int year = 2025;
        boolean isRunning = false;

        void start()

        {
            isRunning = true;
            System.out.println("Starting the car");
        }

        void stop()
        {
            isRunning = false;
            System.out.println("Stopping the car");
        }

    }
