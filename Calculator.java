import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;

        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, ^, /, %): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();

        switch(operator)
        {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num2, num2);
            case '/' -> result = num2 == 0 ? 0 : num1/num2;
            case '%' -> result = num2 == 0 ? 0 : num1 % num2;
            default -> System.out.println("Invalid operation");
        }

        System.out.println(result);

        sc.close();
    }


    
}
