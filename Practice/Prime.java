package Practice;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the # to print the Range of Prime # : ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++)
        {
            if(isprime(i))
            {
                System.out.println(i);
            }
        }
        sc.close();
    }

    static boolean isprime(int n)
    {
        for (int j=2;j*j<=n;j++)
        {
            if (n%j==0)
                return false;
            }
            
        return true;
    }
    
    
}
