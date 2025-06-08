import java.util.HashSet;

public class Unique_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2, 3, 4 };
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr)
        {
            set.add(i);
        }
        System.out.println(set);
        int[] uarr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {
                isUnique = false;
                break;
            }
            }
            if (isUnique) {
            uarr[index++] = arr[i];
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.println(uarr[i]);
        }
        }
        
    }
