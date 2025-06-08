import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("1. Fibonacci series\n" +
                 "2. Factorial\n" +
                 "3. Strong Number\n" +
                 "4. Prime Number\n" +
                 "5. Armstrong Number\n" +
                 "6. Perfect Number\n" +
                 "7. Palindrome Number\n" +
                 "8. Sum of Digits\n" +
                 "9. GCD\n" +
                 "10. LCM\n" +
                 "11. Sieve of Eratosthenes\n" +
                 "12. Sum of Natural Numbers\n" +
                 "13. Length of Number\n" +
                 "14. Reverse of Numbers\n" +
                 "19. Power of Numbers\n" +
                 "20. Digit Frequency\n" +
               "Enter your choice: ");

                 
               switch (sc.nextInt()) {
                case 1 -> fibonacci_series.main(args);
                case 2 -> factorial.main(args);
                case 3 -> strong_number.main(args);
                case 4 -> prime_number.main(args);
                case 5 -> armstrong_number.main(args);
                case 6 -> perfect_number.main(args);
                case 7 -> palindrome_number.main(args);
                case 8 -> sum_of_digits.main(args);
                case 9 -> gcd.main(args);
                case 10 -> lcm.main(args);
                case 11 -> sieve_of_eratosthenes.main(args);
                case 12 -> sum_of_natural_numbers.main(args);
                case 13 -> length_of_number.main(args);
                case 14 -> reverse_of_numbers.main(args);
                case 19 -> power_of_numbers.main(args);
                case 20 -> digit_frequency.main(args);
               }
    }
    
}
