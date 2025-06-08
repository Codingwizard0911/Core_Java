import java.util.*;
public class Anagraams {
    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";
        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
    }
        else {
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();
            char[] s1arr = str1.toCharArray();
            char[] s2arr = str2.toCharArray();
            Arrays.sort(s1arr);
            Arrays.sort(s2arr);
            if (Arrays.equals(s2arr, s1arr))
                System.out.println("anagram");
            else
                System.out.println("Not anagram");
        }
    }

}
