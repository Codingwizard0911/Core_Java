public class countVowCons {
    public static void main(String[] args) {
        String s = "Java is a powerful language";
        int Vcount = 0;
        int Ccount = 0;

        // Convert the string to lowercase to handle case insensitivity
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if the character is a vowel
            if ("aeiou".indexOf(c) != -1) {
                Vcount++;
            }
            // Check if the character is a consonant
            else if (c >= 'a' && c <= 'z') {
                Ccount++;
            }
        }

        System.out.println("Number of vowels: " + Vcount);
        System.out.println("Number of consonants: " + Ccount);
    }
}