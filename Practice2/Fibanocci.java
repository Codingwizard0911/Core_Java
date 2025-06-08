package Practice2;

import java.util.*;
public class Fibanocci {
    static List<Integer> fibanocci(int n) {
        List<Integer> result = new ArrayList<>();
        if (n >= 1) result.add(0);
        if (n >= 2) result.add(1);
        int a = 0, b = 1, c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            result.add(c);
            a = b;
            b = c;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the # : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci sequence is: " + fibanocci(n).toString().replaceAll("[\\[\\],]", ""));
        sc.close();
    }
}
