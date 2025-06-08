import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no  : ");
        int n = sc.nextInt();
        String str = String.valueOf(n);
        double dr = Double.valueOf(n);
        System.out.println(dr);
        System.out.println(str);
        boolean flag = true;
        for (int i = 2; i * i < n; i++)
        {
            if (n % i == 0)
                flag = false;
        }

        System.out.println(flag);
        sc.close();
    }
    
}
