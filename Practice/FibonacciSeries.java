package Practice;
import java.util.*;
public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the # for Fibonacci : ");
        int number = sc.nextInt();
        System.out.println("The Fibonacci of Given Number " + number + " is " + fibonacci(number));
        System.out.println("The Fibonacci of Given Number " + number + " is " + fibonacci1(number));
        sc.close();
    }

    /*
    ITERATION */
   static  int fibonacci(int number)
    {
        int a = 0, b = 1,c =0 ;
        if (number ==0 || number == 1)
            return 1;
        for(int i=2;i<number;i++)
        {
            c = a + b;

            a = b;
            b = c;

        }
        return c;
        
}
static int fibonacci1(int n)
{
    if (n == 0)
        return 0;
    if (n==1)
        return 1;
    return fibonacci(n - 1) + fibonacci1(n - 2);
}
    
}
