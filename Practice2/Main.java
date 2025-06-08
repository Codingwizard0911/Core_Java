import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    // Method to remove duplicates using HashSet
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>(); // Stores unique elements only

        for (int num : arr) {
            set.add(num); // Adds elements to the HashSet (removes duplicates)
        }

        // Convert HashSet to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling method to remove duplicates
        int[] uniqueArray = removeDuplicates(arr);

        // Printing the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

        sc.close();
    }
}
