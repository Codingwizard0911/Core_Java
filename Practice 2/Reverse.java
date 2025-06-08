import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//number of test cases;
        for (int i = 0; i < n; i++)
        {
            System.out.print(
                    "Enter your Operations : \n1.Reverse a number \n2.Reverse a string \n3.Exit\nEnter your choice : ");
            int c = sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.print("Enter the number : ");
                    int num = sc.nextInt();
                    System.out.println(isReverse(num));
                    break;
                case 2:
                    System.out.print("Enter the string : ");
                    String str = sc.next();
                    System.out.println(isRevStr(str));
                    break;
                case 3:
                    System.exit(0);
            }
        }
            sc.close();

    }

    static boolean isReverse(int num) {
        int rev = 0;
        int temp = num;
        while (temp > 0) {
            int d = num % 10;
            rev *= 10 + d;
            temp /= 10;
        }
        return rev == num;
    }

    static boolean isRevStr(String str) {
        int l = str.length();
        String revstr= "";
        for (int i = l - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i);

        }
        return str.equals(revstr);
    }
}
