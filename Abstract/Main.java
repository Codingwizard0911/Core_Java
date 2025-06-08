package Abstract;

import java.awt.Rectangle;

public class Main {
    public static void main(String[] args) {
        /*
         * Abstract ==>Used to defend the Abstract Class and methods 
         * abstraction is the process of hiding implementation details and 
         * showing only the essential features 
         * abstract classes cannot be instantiated directly 
         * can contain abstract methods which must be implemented
         *  can contain concrete methods which are inherited
         */
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(5, 7);
        System.out.println(circle.area());
        System.out.println(triangle.area());
        circle.display();
        triangle.display();


    }
    
}
