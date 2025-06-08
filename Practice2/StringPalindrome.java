package Practice2;

import java.util.*;

public class StringPalindrome {
    static  String stringPalindrome(String s)
    {   
        for(int i = 0 ; i<s.length()/2;i++)
        {
            if (s.toUpperCase().charAt(i) != s.toUpperCase().charAt(s.length() - i - 1))
                return "not a Palindrome";
        }
        return "Palindrome";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("The String " + s + " is " + stringPalindrome(s));
        sc.close();
    }
    
}
