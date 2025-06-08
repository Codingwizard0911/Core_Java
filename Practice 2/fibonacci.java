import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        int a = 0,
                b = 1,
                c = 0;
      /* *  for (int i = 0; i < =n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }*/
        System.out.println(Fibonacci(n));

        sc.close();
    }

    static int Fibonacci(int n)
    {
        if(n<=1)
            return n;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    
}
