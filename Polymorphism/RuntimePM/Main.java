package Polymorphism.RuntimePM;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*Run Time Polymorphism ==> When the method that gets executed is decided 
                                    at runtime based on the actual type of the object
         */
        Scanner sc = new Scanner(System.in);
        Animal animal;
        System.out.println("Would you like a dog or cat(1=>Dog 2=>Cat)");
        int choice = sc.nextInt();

        if(choice==1)
        {
            animal = new Dog();
            animal.speak();
        }

        if(choice==2)
        {
            animal = new Cat();
            animal.speak();
        }
    }
    
}
