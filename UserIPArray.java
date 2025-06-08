import java.util.*;
public class UserIPArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of foods: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] foods = new String[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter a food: ");
            foods[i] = sc.nextLine();
        }
        Arrays.sort(foods);
            for (String food : foods)
            {
                System.out.println(" " + food);
            }       
    }
    
}
