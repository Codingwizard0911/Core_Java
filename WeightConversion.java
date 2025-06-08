import java.util.Scanner;


public class WeightConversion {
    public static void main(String[] args) {
        // WEIGHT CONVERSION PROGRAM
        //Variable Declaration
        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;


        System.out.println("WEIGHT CONVERSION PROGRAM");
        System.out.println("1. Pounds to Kilograms");
        System.out.println("2. Kilograms to Pounds");
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();


        //Convert Pounds to Kilograms
        if (choice == 1) {
            System.out.println("Enter the weight in Pounds: ");
            weight = sc.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.println("The weight in Kilograms is: " + newWeight);
        }
        //Convert Kilograms to Pounds
        else if (choice == 2) {
            System.out.println("Enter the weight in Kilograms: ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("The weight in Pounds is: " + newWeight);
        }

        else {
            System.out.println("That's not a valid Choice");
        }
        sc.close();
        
    }
    
}
