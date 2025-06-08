
import java.util.HashMap;
import java.util.Map;

public class charactercounting {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
       /* for (int i = 0; i < 256; i++) {
            if (count[i] != 0)
                System.out.println((char) i + " : " + count[i]);*/
        //}
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char a:arr)
        {
            map.put(a, map.getOrDefault(a, 0) + 1);

        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
