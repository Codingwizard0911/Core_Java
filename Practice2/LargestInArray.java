package Practice2;
import java.util.*;

public class LargestInArray {
    static ArrayList<Integer> getUserInput()
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        System.out.print("Enter the size of Array : ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }

    static int findMax(ArrayList<Integer> numbers)
    {
        return Collections.max(numbers);
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getUserInput();
        System.out.println("The Largest number in Array is " + findMax(numbers));

    }
    
}
