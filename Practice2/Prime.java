package Practice2;
import java.util.*;

public class Prime {
    static  String prime (int n)
    {
        if (n < 0)

            return "-1";
        for (int i =2; i*i <n ; i++)
        {
            if (n % i == 0)
                return "Not Prime";
        }
        return "Prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the # : ");
        int n = sc.nextInt();
        System.out.println("The given number " + n + " is " + prime(n));
        sc.close();
    }
    
}
