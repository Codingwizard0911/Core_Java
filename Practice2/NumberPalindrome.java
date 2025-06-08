package Practice2;
import java.util.*;

public class NumberPalindrome {
    static  boolean numberPalindrome(int n)
    {
        String s = String.valueOf(n);
        int l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1))
                return false;
        }
        return true;
    }

    static boolean numberPalindrome1(int n) {
        int rev = 0;
        int temp = n;
        while (temp>0)
        {
            int d = n % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }
        return n == rev;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the # :");
        int n = scanner.nextInt();
        System.out.println(numberPalindrome(n));
        System.out.println(numberPalindrome1(n));
        scanner.close();

    }
    
}
