package Practice2;

import java.util.*;

public class ReverseString {

        static String reverseString(String s)
        {
            StringBuilder reverse = new StringBuilder();
            int n = s.length();
            for(int i=n-1;i>=0;i--)
            {
                reverse.append(s.charAt(i));
            }
            return reverse.toString();
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String to Reverse : ");
        String s = sc.nextLine();
        System.out.println("The Reversed String is " + (reverseString(s)));
        sc.close();
    }
    
}
