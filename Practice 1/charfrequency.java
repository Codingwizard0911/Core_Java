import java.util.HashMap;
public class charfrequency {
    public static void main(String[] args) {
        String str = "abcabcabdc";
        HashMap<Character, Integer> freq = freqMap(str);
        for (char key : freq.keySet()) {
            System.out.println(key + " : " + freq.get(key));
        }
    }
    static HashMap<Character,Integer> freqMap(String str)
    {
        HashMap<Character, Integer> counts = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c : chars)
        {
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            } else {
                counts.put(c, 1);
            }
        }
        return counts;
    }
}
