package Practice;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the # to find the factorial : ");
        int number = sc.nextInt();
        System.out.println("The Factorial of given number " + number + " is " + factorial(number));
        sc.close();

    }
    
    static int factorial(int number)
    {
        if(number == 0 || number == 1)
            return 1;

        else 
            return number * factorial(number - 1);
    }
    
}
