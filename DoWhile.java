import java.util.Scanner;
public class DoWhile
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age = 0;

            do { 
            System.out.println("Your age can't be negative");
            System.out.println("Enter Your age");
            age = sc.nextInt();
        } while (age >   0);
            

         System.out.println("Age "+age);

    }
}