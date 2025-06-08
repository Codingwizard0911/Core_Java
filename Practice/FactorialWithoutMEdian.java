package Practice;

import java.util.Scanner;

public class FactorialWithoutMEdian {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        int res = 1;
        int mid1 = n / 2;
        int mid2 = (n % 2 == 0) ? mid1 + 1 : mid1; // Mid values to skip (corrected for odd numbers)

        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            if (i != mid1 || i != mid2) { // Skip the median value
                res *= i; // Multiply only if it's not the median
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Factorial (excluding median): " + factorial(n));
        sc.close();
    }
}
