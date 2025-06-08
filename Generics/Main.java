package Generics;
import java.util.*;;
public class Main {
    public static void main(String[] args) {
        /*
         * Generics ==> A concept where you can write a class interface or method
         * That is comfortable with different data types
         *<T> Type parameter (placeholder that gets replaced with a real type)
         * <String/dtype> Type argument ( specifies the type)
         */
        ArrayList<String> fruits = new ArrayList<>();

     /*   fruits.add("Mango");
     fruits.add("Orange");
     fruits.add("Berry");
     */
     Box<String> box = new Box<>();
     box.setItem("Banana");
     
     System.out.println(box.getItem());
    }
    
}
