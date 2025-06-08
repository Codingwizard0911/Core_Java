import java.util.*;

public class Wordrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Strings : ");
        String str = sc.nextLine();
        System.out.println(reverse(str));
        sc.close();
    }

    public static String reverse(String str) {
        String[] words = str.trim().split("\\s+"); 
        StringBuilder reversed = new StringBuilder();
        for(int i = words.length-1 ; i>=0 ; i--) {
            reversed.append(words[i] + " ");
        }
        return reversed.toString().trim();
}
}