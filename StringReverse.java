import java.util.*;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length()-1; i >=0; i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);

        for (int i = 0;i<str.length()/2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length()-i-1))
            {
                System.out.println("String is not Palindrome");
                break;
            }
        }

        if(str.equals(rev))
        {
            System.out.println("String is Palindrome");
        }
    }
    
}
