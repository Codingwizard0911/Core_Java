package Practice;
import java.util.*;

public class Palindromecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter # or String to check whether it is Palindrome or not : (1.Number/2.String) : ");
        int choice = sc.nextInt();
        if (choice == 1)
        {
            System.out.print("Enter the # : ");
            int n = sc.nextInt();
            sc.nextLine();
            System.out.println(numCheck(n));
        }

        if (choice == 2)
        {
            System.out.print("Enter the # : ");
            String s = sc.nextLine();
            System.out.println(StringCheck(s));
        }

    }

    static String StringCheck(String s)
    {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return "The String is not Palindrome";
            }
        }
        return "The String is Palindrome";

        }
    
    static String numCheck(int n)
    {
        String s = Integer.toString(n);
        for(int i=0;i<s.length()/2;i++)
        {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return "The String is not Palindrome";
            }

        }
        return "This is Palindrome";
    }
}
