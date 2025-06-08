
import java.util.HashMap;

public class countfreq {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if (freq[i] > 0)
                System.out.println((char) i + " : " + freq[i]); 
        }
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char a:arr)
        {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for(HashMap.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
