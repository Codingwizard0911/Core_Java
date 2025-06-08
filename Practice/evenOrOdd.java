package Practice;
import java.util.*;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the # to check : ");
        int number = sc.nextInt();
        String result = (number % 2 == 0) ? "Even" : "odd";
        /*if(number%2==0)
         * {
         *      even
         * }
         * else
         * {
         *      odd;
         * }
         */
        System.out.println("The number " + number + " is " + result);

        sc.close();
    }
    
}
