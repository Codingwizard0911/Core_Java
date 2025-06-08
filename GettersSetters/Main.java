package GettersSetters;

public class Main {
    public static void main(String[] args) {
        /*
         * They help protect object data and rules for accessing or modifying them 
         * getters means methods that make a field readable
         *  setters as defines methods that make it feel writable
         */
        Car car = new Car("Charger", "Yellow");
        car.setColor = "Blue";
        //System.out.println(car.Model + " " + car.Color + " " + car.year);
        System.out.println(car.getModel() + " " + car.getColor() + " " );
    }

    
}
