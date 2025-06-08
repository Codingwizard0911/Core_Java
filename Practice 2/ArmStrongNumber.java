public class ArmStrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int sum = 0;
        String s = String.valueOf(num);
        int n = s.length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, n);
            temp /= 10;

        }
        if (sum == num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
         temp = num;
int sum1 = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum1 += factorial(d);
            temp /= 10;

        }
        if (sum1 == num) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }

    static int factorial(int n) {
        if (n==1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
