public class longestWord {
    public static void main(String[] args) {
        String s = "Java is a powerful language";
        String[] words = s.split("\\s+");
        int maxlength = 0;
        String longestword = null;
        for (String word : words) {
            if (word.length() > maxlength) {
                maxlength = word.length();
                longestword = word;
            }
        }
        System.out.println("Longest word: " + longestword);
    }
    
}
