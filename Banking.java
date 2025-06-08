import java.util.*;

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Welcome to the Bank of India");
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Your balance is: " + balance);
                }
                case 2 -> {
                    System.out.println("Enter the amount to deposit: ");
                    balance += sc.nextDouble();
                    System.out.println("Your balance is: " + balance);
                }
                case 3 -> {
                    System.out.println("Enter the amount to withdraw: ");
                    balance -= sc.nextDouble();
                    System.out.println("Your balance is: " + balance);
                }
                case 4 -> {
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice");
            }
        }

        sc.close();

    }
}
