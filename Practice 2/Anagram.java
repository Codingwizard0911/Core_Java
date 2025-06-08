
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        /*  boolean flag = true;
        if (ch1.length == ch2.length) {
           for (int i = 0; i < ch1.length; i++) {
               for (int j = 0; j < ch2.length; j++) {
                   if (ch1[i] == ch2[j]) { 
                       flag = true;
                       break;
                   } else {
                       flag = false;
                   }
               }
           }
        } else {
           flag = false;
        }
        if (flag) {
           System.out.println("Anagram"); */
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) 
            System.out.println("Anagram");
        else {
            System.out.println("Not Anagram");
        }
    }
}

