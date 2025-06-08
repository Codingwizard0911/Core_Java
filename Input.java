/*To use a input from user and store it in a variable we need to use Scanner class for that 
we need to import scanner class from java.util package*/
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("where are you from?");
        String city = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your gpa: ");
        double gpa = scanner.nextDouble();
        System.out.println("Are you a student? true/false");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Enter your phone number: ");
        long phone = scanner.nextLong();
        System.out.println("Enter your weight: ");
        float weight = scanner.nextFloat();

        System.out.println("Hello " + name);
        System.out.println("You are form " + city);
        System.out.println("You are" + age + "years old");
        System.out.println("Your GPA is " + gpa);
        if (isStudent) {
            System.out.println("You are a Student");
        } else {
            System.out.println("You are not a student");
        }
        System.out.println("Your phone number is " + phone);
        System.out.println("Your weight is " + weight);
        scanner.close();
    }
        
    /* Common Issues:
     * The issue you're facing with nextInt and nextLine typically happens because nextInt doesn't consume the
     * after reading an integer when you call next it reads the integer but leaves the
     * in the input buffer which is then immediately consumed by the next
     * causing it to behave unexpectedly like skipping input
     * example:
     * Scanner scanner = new Scanner(System.in);
     * int a=scanner.nextInt();
     * String b=scanner.nextLine();
     * System.out.println("a = " + a);
     * System.out.println("B=   '+b);
     * output:
     * a = 5
     * B= a=5
     * To fix this use scanner.nextLine(); after nextInt
     * Scanner scanner = new Scanner(System.in);
     * int a=scanner.nextInt();
     * scanner.nextLine();
     * String b=scanner.nextLine();
     * system.out.println("a = " + a);
     * system.out.println("B=   '+b);
     * output:
     * a = 5
     * B= 10
     */
    /* Input Output 
     * Boolean ==> true or false(scanner.nextBoolean())
     * String ==> scanner.nextLine()
     * Integer ==> scanner.nextInt()
     * Double ==> scanner.nextDouble()
     * Long ==> scanner.nextLong()
     * Float ==> scanner.nextFloat()
     * There is no direct scanner class for byte we can achieve this by type casting int to byte byte a = (byte) scanner.nextInt();
     * also for char we can use scanner.next().charAt(0);
     * Difference between next() and nextLine() is that next() will take only one word as a input and
     * nextLine() will take the whole line as a input
     * 
     * scanner need to be closed to avoid memory leak
     *  
     * close() is used to close the scanner
    */
}
