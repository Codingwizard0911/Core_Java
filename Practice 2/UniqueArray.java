import java.util.*;
public class UniqueArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4 };
        HashSet<Integer> uarr = new HashSet<>();
        for(int i : arr)
            uarr.add(i);
        System.out.println(uarr);
    }
}
