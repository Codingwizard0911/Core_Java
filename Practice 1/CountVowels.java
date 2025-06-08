public class CountVowels {
    public static void main(String[] args) {
        String s = "Abcdefghijklmnopqrstuvwxyz123456789";
        s = s.toLowerCase();
        int vowels = 0,consonants=0;
        for(int i=0;i<s.length();i++)
        {
            if (Character.isLetter(s.charAt(i))) {
                if ("aeiou".indexOf(s.charAt(i)) != -1) {
                    vowels++;
                } else
                    consonants++;
            }
        }
System.out.println(vowels+" "+consonants);
    }
}
