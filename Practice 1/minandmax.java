import java.lang.reflect.Array;
import java.util.*;

public class minandmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum : " + mini(arr) + "\nMaximum : " + maxi(arr));
        sc.close();
    }

    static int mini(int[] arr)
    {
        Arrays.sort(arr);
        return arr[0];
    }
    static int maxi(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
