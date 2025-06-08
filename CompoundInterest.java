import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal, rate, amount;
        int timecompound, years;
        System.out.println("Enter the principal amount:");
        principal = sc.nextDouble();
        System.out.println("Enter the rate of interest (in percent):");
        rate = sc.nextDouble() / 100;
        System.out.println("Enter the number of times compounded per year:");
        timecompound = sc.nextInt();
        System.out.println("Enter the no. of. years: ");
        years = sc.nextInt();
        amount = principal * Math.pow(1 + rate / timecompound, years * timecompound);
        System.out.printf("The amount after %d  years is %, .5f ", years, amount);
        sc.close();

    }
}
