import java.util.*;

class vowelsconsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int countvowel = 0, countconsonant = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                countvowel++;
            } else {
                countconsonant++;
            }
        }
        System.out.println("Vowels : " + countvowel + "\nConsonants : " + countconsonant);
    }
    
}