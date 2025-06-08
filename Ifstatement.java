import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        int age;
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.println("Are you a student? true/false");
        boolean isStudent = sc.nextBoolean();
        /*Name */
        if (name.isEmpty())
        {
            System.out.println("Please enter your name");
        }

        /*Age */
        if(age>=18)
        {
            System.out.println("You are an adult");
        }
        else if(age>18 && age<50)
        {
            System.out.println("You are a middle-aged person");
        }
        else if(age>=50)
        {
            System.out.println("You are a senior citizen");
        }
        else if(age<0)
        {
            System.out.println("You haven't born yet");
    
        }
        else if(age==0)
        {
            System.out.println("You are a new baby");
        }
        else
        {
            System.out.println("You are a child");
        }


        /*Student */
        if(isStudent)
        {
            System.out.println("You are a student");
        }
        else
        {
            System.out.println("You are not a student");
        }
        sc.close();
    }
    
}
