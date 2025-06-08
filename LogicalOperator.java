import java.util.Scanner;
public class LogicalOperator {

    public static void main(String[] args) {
        //Logical operator &&, ||, !
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature:");
        double temp = sc.nextDouble();
        System.out.print("Is out is Sunny? true/fasle");
        boolean isSunny = sc.nextBoolean();

        if(temp <=30 && temp >=0 && isSunny)
        {
            System.out.println("The weather is Good");
            System.out.println("Looks Sunny Outside");
        }

        else if(temp <=30 && temp >=0 && !isSunny)
        {
            System.out.println("The weather is Good");
            System.out.println("Looks Cloudy Outside");
        }

        else if(temp >30 || temp <0 )
        {
            System.out.println("The weather is bad");
        }



    }
    
}
