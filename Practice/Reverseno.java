package Practice;
import java.util.*;

public class Reverseno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the # to Reverse : ");
        int number = sc.nextInt();
        System.out.println("The Reversed number is " + reverse(number));
        System.out.println("The Reversed number is "+reverse1(number,0));
        sc.close();
    }

    static int reverse(int n)

    {
        int rno = 0;
        if (n < 0)
            return -1;
        while (n > 0) {
            int d = n % 10;
            rno = rno * 10 + d;
            n /= 10;
        }
        return rno;
    }
    
    /*Recursive */
    static int reverse1(int num,int rev)
    {
        if (num == 0)
            return rev;
        return reverse1(num/10,rev*10+num%10);
    }
    
}
