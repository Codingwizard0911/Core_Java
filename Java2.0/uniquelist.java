import java.util.*;
import java.util.LinkedList;
import javax.security.auth.login.AppConfigurationEntry;

public class uniquelist
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int m : arr)
        {
            list.add(m);
        }

        System.out.println(list.size());
        for(int m :list)
        {
            System.out.print(m+" ");
        }

        for (int m : arr)
        {
            map.put(m, map.getOrDefault(m, 0) + 1);
        }

        return Map.Entry<Integer, Integer> m;
        for(Map.Entry<Integer, Integer> m : map.entrySet())
        {
            if(m.getValue() == 1)
            {
                System.out.println(m.getKey() + " " + m.getValue());

                
            }
        }
        for(int m :arr)
        {
            set.add(m);
        }

        System.out.println(set.size());
        for(int m :set)
        {
            System.out.print(m+" ");
        }
    }
}