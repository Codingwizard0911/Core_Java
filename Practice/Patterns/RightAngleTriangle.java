package Practice.Patterns;
import java.util.*;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the # : ");
        int n = sc.nextInt();
        rightAngleTriangle(n);
        numberPattern(n);
        reversedRightAngleTriangle(n);
        diamond(n);
        sc.close();
    }


   static void rightAngleTriangle(int n)
   {
       for (int i = 0; i <= n; i++) {
           for (int j = 0; j < i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
    
   static void numberPattern(int n)
   {
       for (int i = 0; i <= n; i++) {
           for (int j = 1; j < i + 1; j++) {
               System.out.print(j + " ");
           }
           System.out.println();
       }
   }
   
   static void reversedRightAngleTriangle(int n)
   {
       for (int i = n; i >= 1; i--) {
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
    
   static  void diamond(int n) {
    

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
    

