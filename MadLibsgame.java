import java.util.Scanner;

public class MadLibsgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adjective1, noun1, adjective2, verb1, adjective3;
        System.out.print("Enter an adjective (descriptive word): ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a noun (name of person, place, thing): ");
        noun1 = sc.nextLine();
        System.out.print("Enter another adjective: ");
        adjective2 = sc.nextLine();
        System.out.print("Enter a verb (action): ");
        verb1 = sc.nextLine();
        System.out.print("Enter another adjective: ");
        adjective3 = sc.nextLine();
        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("I saw a " + noun1 + " jumping up and down in its tree.");
        System.out.println("He " + verb1 + " through the large tunnel that led to its " + adjective3 + " cave.");
        System.out.println(
                "I got some peanuts and passed them through the cage to a gigantic " + adjective2 + " " + noun1 + ".");
        sc.close();
    }
}
