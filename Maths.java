import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);

        double result;
        result = Math.pow(2, 3);
        System.out.println("2^3: " + result);

        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("Absolute value of -25: " + Math.abs(-25));
        System.out.println("Ceiling of 25.5: " + Math.ceil(25.5));
        System.out.println("Floor of 25.5: " + Math.floor(25.5));
        System.out.println("Round of 25.5: " + Math.round(25.5));
        System.out.println("Round of 25.4: " + Math.round(25.4));

        System.out.println("Minimum of (25, 6): " + Math.min(25, 6));
        System.out.println("Maximum of (25, 6): " + Math.max(25, 6));

        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        System.out.println("Hypotenuse: " + Math.hypot(a, b));

        result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("HYPOTENUSE: %.5f cm²%n", result);

        sc.close();
     
    }
}
