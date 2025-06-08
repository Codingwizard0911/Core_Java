import java.util.Random;
import java.util.Scanner;

public class NumberGuesing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();

        int guess, randomnumber, attempts=0;

        randomnumber = rc.nextInt(1, 11);

        System.out.println("Number Guessing game");
        System.out.println("Guess a number between 1 - 10");

        do { 
            System.out.print("Enter a Guess: ");
            guess = sc.nextInt();
            attempts++;
            String far = (guess == randomnumber) ? "You have Won \n Number attempts to guess it: "+attempts : (guess < randomnumber ? "Too Low and Try Again" : "Too high and try again");

            System.out.println(far);

        } while (guess != randomnumber);

    }
    
}
