package Student.Cons;

import java.util.Scanner;
public class Dummy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students do you have?");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        // Input validation
        while(n <= 0){
            System.out.println("Please enter a positive number:");
            n = sc.nextInt();
            sc.nextLine(); // Consume the newline character
        }
        
        // Process each student
        for(int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i+1) + ":");
            System.out.print("Enter your name: ");
            String name = sc.nextLine();
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.print("Enter your city: ");
            String city = sc.nextLine();
            
            // Display the information for this student
            System.out.println("\nStudent " + (i+1) + " details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
        }
    }
}

