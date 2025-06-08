import java.util.Scanner;

public class UsernameSetup {
    public static void main(String[] args) {
        //username must be contains between 4 - 12 characters
        //username must not contain any spaces or underscore
        Scanner sc = new Scanner(System.in);
        String username;
        System.out.println("Enter your new username");
        username = sc.nextLine();

        if (username.length() < 4 || username.length() > 12)
        {
            System.out.println("Username must be between 4 - 12 characters");
        }
        else if(username.contains(" ") || username.contains("_"))
        {
            System.out.println("Username must not contain any spaces and underscores");
        }
        else
        {
            System.out.println("Username accepted: "+username);
        }
    }
    
}
