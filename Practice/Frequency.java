package Practice;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        String s = sc.nextLine();
        for (char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        System.out.println("The Frequency of String");
        for (HashMap.Entry<Character, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }

        sc.close();
    }
    
}
