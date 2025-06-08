import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the number : ");
        int num = sc.nextInt();
        System.out.println("The factorial of " + num + " is " + fact(num));
    }

    static int fact(int num)
    {
        if(num == 0 || num == 1)
        {
            return 1;
        }
        else
        {
            return num * fact(num-1);
        }
    }
}
