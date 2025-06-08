import java.util.*;

class RangedPrimenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                flag = false;
        }
        if (flag)
            System.out.println("prime");
        else
            System.out.println("Not prime");
        sc.close();
        for (int i = 2; i <= num; i++) {
            if (Prime(i))
            {
                System.out.print(i+ " ");
            }
        }
    }


    public static boolean Prime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}