import java.util.Arrays;
public class Array {

    public static void main(String[] args) {
        //array ==> a collection of similar data types
        //array ==> used to store multiple values in a single variable
        String[] fruits = { "apple", "banana", "orange" };
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        fruits[0] = "mango";
        Arrays.sort(fruits);
        System.out.println("\n" + fruits[0]);
        int numOfFruits = fruits.length;
        System.out.println(numOfFruits);


    }
}
