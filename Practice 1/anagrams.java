
import java.util.Arrays;
public class anagrams {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "fedcba";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);

        if(s1arr.length != s2arr.length)
            System.out.println("Not anagram");
        if (Arrays.equals(s2arr,s1arr))
            System.out.println("anagram");
        else
            System.out.println("Not anagram");

    }
}
