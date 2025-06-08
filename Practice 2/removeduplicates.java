
import java.util.HashSet;
import java.util.Set;

public class removeduplicates {
    public static void main(String[] args) {
        String str = "Programming";
        char[] strarr =str.toCharArray();
        Set<Character> newstr = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for(char s : strarr)
        {
            if (!newstr.contains(s)) {
                newstr.add(s);
                res.append(s);
            }
        }
        System.out.println(res);
    }
}
