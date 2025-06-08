import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice \n1. Integer \n2. String: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter the integer: ");
            int num = sc.nextInt();
            int rev = 0;
            while (num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }
            System.out.println(rev==num);
        }

        if (choice == 2) {
            System.out.print("Enter the String: ");
            String str = sc.nextLine();
            str = str.toUpperCase();
            boolean flag = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag);
            sc.close();
        }
    }
}
