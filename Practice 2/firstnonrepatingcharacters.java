public class firstnonrepatingcharacters {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char result = findFirstNonRepeatingCharacter(s);
        System.out.println(result);
    }

    public static char findFirstNonRepeatingCharacter(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        for (char c : s.toCharArray()) {
            if (freq[c] == 1)
                return c;
        }
        return '_';
    }
}
    

