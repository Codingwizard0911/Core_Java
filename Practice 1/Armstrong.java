public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        String s=String.valueOf(n);
        int num = s.length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, num);
            n /= 10;
        }
       System.out.println(temp==sum);
    }
}
