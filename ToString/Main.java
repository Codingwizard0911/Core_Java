package ToString;

import java.lang.classfile.instruction.ThrowInstruction;

public class Main {
    public static void main(String[] args) {
        /* .toString() ==>Method in a inherited from the object class
                        used to written a string representation of an object
                        By default it retains a hash code as a unique identifier
                        it can be overwritten to provide meaningful details*/
        Car car = new Car("Ford", "Mustang", 2025, "Red");
        System.out.println(car);
        //When Directly call that we will get unique hashcode before using to string method

        //after using to string method we can call it directly(Car)
        System.out.println(car);
        

    }
    
}
