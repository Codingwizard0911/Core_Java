package Practice;
import java.util.*;

public class ReverseWords 
{
    static String reverseWords(String str)
    {
        String[] words = str.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=words.length -1 ;i>=0;i--)
        {
            res.append((words[i])).append(" ");
        }
        return res.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
        sc.close();

    }
    
}
